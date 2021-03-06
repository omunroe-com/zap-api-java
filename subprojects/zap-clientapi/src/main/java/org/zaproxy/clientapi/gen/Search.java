/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2017 The ZAP Development Team
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
 */
package org.zaproxy.clientapi.gen;

import java.util.HashMap;
import java.util.Map;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

/** This file was automatically generated. */
@SuppressWarnings("javadoc")
public class Search extends org.zaproxy.clientapi.gen.deprecated.SearchDeprecated {

    private final ClientApi api;

    public Search(ClientApi api) {
        super(api);
        this.api = api;
    }

    public ApiResponse urlsByUrlRegex(String regex, String baseurl, String start, String count)
            throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("regex", regex);
        if (baseurl != null) {
            map.put("baseurl", baseurl);
        }
        if (start != null) {
            map.put("start", start);
        }
        if (count != null) {
            map.put("count", count);
        }
        return api.callApi("search", "view", "urlsByUrlRegex", map);
    }

    public ApiResponse urlsByRequestRegex(String regex, String baseurl, String start, String count)
            throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("regex", regex);
        if (baseurl != null) {
            map.put("baseurl", baseurl);
        }
        if (start != null) {
            map.put("start", start);
        }
        if (count != null) {
            map.put("count", count);
        }
        return api.callApi("search", "view", "urlsByRequestRegex", map);
    }

    public ApiResponse urlsByResponseRegex(String regex, String baseurl, String start, String count)
            throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("regex", regex);
        if (baseurl != null) {
            map.put("baseurl", baseurl);
        }
        if (start != null) {
            map.put("start", start);
        }
        if (count != null) {
            map.put("count", count);
        }
        return api.callApi("search", "view", "urlsByResponseRegex", map);
    }

    public ApiResponse urlsByHeaderRegex(String regex, String baseurl, String start, String count)
            throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("regex", regex);
        if (baseurl != null) {
            map.put("baseurl", baseurl);
        }
        if (start != null) {
            map.put("start", start);
        }
        if (count != null) {
            map.put("count", count);
        }
        return api.callApi("search", "view", "urlsByHeaderRegex", map);
    }

    public ApiResponse messagesByUrlRegex(String regex, String baseurl, String start, String count)
            throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("regex", regex);
        if (baseurl != null) {
            map.put("baseurl", baseurl);
        }
        if (start != null) {
            map.put("start", start);
        }
        if (count != null) {
            map.put("count", count);
        }
        return api.callApi("search", "view", "messagesByUrlRegex", map);
    }

    public ApiResponse messagesByRequestRegex(
            String regex, String baseurl, String start, String count) throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("regex", regex);
        if (baseurl != null) {
            map.put("baseurl", baseurl);
        }
        if (start != null) {
            map.put("start", start);
        }
        if (count != null) {
            map.put("count", count);
        }
        return api.callApi("search", "view", "messagesByRequestRegex", map);
    }

    public ApiResponse messagesByResponseRegex(
            String regex, String baseurl, String start, String count) throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("regex", regex);
        if (baseurl != null) {
            map.put("baseurl", baseurl);
        }
        if (start != null) {
            map.put("start", start);
        }
        if (count != null) {
            map.put("count", count);
        }
        return api.callApi("search", "view", "messagesByResponseRegex", map);
    }

    public ApiResponse messagesByHeaderRegex(
            String regex, String baseurl, String start, String count) throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("regex", regex);
        if (baseurl != null) {
            map.put("baseurl", baseurl);
        }
        if (start != null) {
            map.put("start", start);
        }
        if (count != null) {
            map.put("count", count);
        }
        return api.callApi("search", "view", "messagesByHeaderRegex", map);
    }

    public byte[] harByUrlRegex(String regex, String baseurl, String start, String count)
            throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("regex", regex);
        if (baseurl != null) {
            map.put("baseurl", baseurl);
        }
        if (start != null) {
            map.put("start", start);
        }
        if (count != null) {
            map.put("count", count);
        }
        return api.callApiOther("search", "other", "harByUrlRegex", map);
    }

    public byte[] harByRequestRegex(String regex, String baseurl, String start, String count)
            throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("regex", regex);
        if (baseurl != null) {
            map.put("baseurl", baseurl);
        }
        if (start != null) {
            map.put("start", start);
        }
        if (count != null) {
            map.put("count", count);
        }
        return api.callApiOther("search", "other", "harByRequestRegex", map);
    }

    public byte[] harByResponseRegex(String regex, String baseurl, String start, String count)
            throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("regex", regex);
        if (baseurl != null) {
            map.put("baseurl", baseurl);
        }
        if (start != null) {
            map.put("start", start);
        }
        if (count != null) {
            map.put("count", count);
        }
        return api.callApiOther("search", "other", "harByResponseRegex", map);
    }

    public byte[] harByHeaderRegex(String regex, String baseurl, String start, String count)
            throws ClientApiException {
        Map<String, String> map = new HashMap<>();
        map.put("regex", regex);
        if (baseurl != null) {
            map.put("baseurl", baseurl);
        }
        if (start != null) {
            map.put("start", start);
        }
        if (count != null) {
            map.put("count", count);
        }
        return api.callApiOther("search", "other", "harByHeaderRegex", map);
    }
}
