/*
 * Copyright 2019 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.starter;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.jackson.DatabindCodec;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * @author Thomas Segismont
 */
public class Util {

  @SuppressWarnings("unchecked")
  public static JsonObject loadStarterData() throws IOException {
    try (InputStream is = WebVerticle.class.getClassLoader().getResourceAsStream("starter.json")) {
      return new JsonObject(DatabindCodec.mapper().readValue(is, Map.class));
    }
  }
}
