/*
 * Copyright The Stargate Authors
 *
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
package io.stargate.web.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClusteringExpression {
  final String column;
  final String order;

  @JsonCreator
  public ClusteringExpression(
          @JsonProperty("name") String column,
          @JsonProperty("order") String order) {
    this.column = column;
    this.order = order;
  }

  public String getColumn() {
    return column;
  }

  public String getOrder() {
    return order;
  }
}