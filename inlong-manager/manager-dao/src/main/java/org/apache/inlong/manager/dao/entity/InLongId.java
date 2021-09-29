/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.manager.dao.entity;

/**
 * InLongId
 */
public class InLongId {
    private String inlongId;
    private String topic;
    private String params;
    private String setName;

    /**
     * get inlongId
     * 
     * @return the inlongId
     */
    public String getInlongId() {
        return inlongId;
    }

    /**
     * set inlongId
     * 
     * @param inlongId the inlongId to set
     */
    public void setInlongId(String inlongId) {
        this.inlongId = inlongId;
    }

    /**
     * get topic
     * 
     * @return the topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * set topic
     * 
     * @param topic the topic to set
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * get params
     * 
     * @return the params
     */
    public String getParams() {
        return params;
    }

    /**
     * set params
     * 
     * @param params the params to set
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * get setName
     * 
     * @return the setName
     */
    public String getSetName() {
        return setName;
    }

    /**
     * set setName
     * 
     * @param setName the setName to set
     */
    public void setSetName(String setName) {
        this.setName = setName;
    }

}
