/*******************************************************************************
*  Code contributed to the webinos project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
* Copyright 2011-2012 Paddy Byers
*
******************************************************************************/

package org.webinos.api.messaging;

import java.util.Date;

import org.meshpoint.anode.idl.Dictionary;

public class MessageFilter implements Dictionary {
    public String id;
    public int[] type;
    public int[] folder;
    public Date startTimestamp;
    public Date endTimestamp;   
    public String from;
    public String[] to;
    public String[] cc;
    public String[] bcc;
    public String body;
    public Boolean isRead;
    public Boolean messagePriority;
    public String subject;
}
