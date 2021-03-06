/**
 * Copyright 2015 presidentio
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.presidentio.teamcity.jmh.runner.common.param;

import com.presidentio.teamcity.jmh.runner.common.cons.Dictionary;
import com.presidentio.teamcity.jmh.runner.common.cons.RunnerParamTypeConst;

import java.util.Map;

/**
 * Created by presidentio on 12.05.15.
 */
public class SelectRunnerParameter extends BaseRunnerParam {

    private static final String DEFAULT = "default";

    private Map<String, String> allowedValues;

    public SelectRunnerParameter(Map<String, String> allowedValues, int type, String name, String commandLineName,
                                 boolean required, String shortDescription, String description) {
        super(type, name, commandLineName, required, shortDescription, description);
        this.allowedValues = allowedValues;
    }

    public SelectRunnerParameter(Map<String, String> allowedValues, String name, String commandLineName,
                                 boolean required, String shortDescription, String description) {
        super(RunnerParamTypeConst.STRING_SELECT, name, commandLineName, required, shortDescription, description);
        this.allowedValues = allowedValues;
    }

    @Override
    public String process(String value) throws ValidationException {
        if (value != null && !allowedValues.containsKey(value)) {
            throw new ValidationException(Dictionary.ERROR_MUST_BE_ONE_OF + allowedValues);
        }
        if (value != null && value.equals(DEFAULT)) {
            value = null;
        }
        return super.process(value);
    }

    public Map<String, String> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(Map<String, String> allowedValues) {
        this.allowedValues = allowedValues;
    }
}
