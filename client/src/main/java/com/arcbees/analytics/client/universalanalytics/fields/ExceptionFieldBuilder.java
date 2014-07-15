/**
 * Copyright 2014 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.arcbees.analytics.client.universalanalytics.fields;

import com.google.gwt.json.client.JSONBoolean;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;

public class ExceptionFieldBuilder extends FieldBuilder {
    ExceptionFieldBuilder(final JSONObject jsonObject) {
        super(jsonObject);
    }

    /**
     * Optional.
     * Specifies the description of an exception..
     * @param exceptionDescription <br>
     * Default: none<br>
     * Example Value: DatabaseError
     */
    public ExceptionFieldBuilder exceptionDescription(final String exceptionDescription) {
        put("exDescription", new JSONString(exceptionDescription));
        return this;
    }

    /**
     * Optional.
     * Specifies whether the exception was fatal.
     * @param fatal <br>
     * Default: true;<br>
     */
    public ExceptionFieldBuilder exceptionFatal(final boolean fatal) {
        put("exFatal", JSONBoolean.getInstance(fatal));
        return this;
    }
}