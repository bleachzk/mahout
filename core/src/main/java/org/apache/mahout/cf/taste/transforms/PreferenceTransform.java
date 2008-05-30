/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.mahout.cf.taste.transforms;

import org.apache.mahout.cf.taste.common.Refreshable;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.Preference;

/**
 * <p>Implementations encapsulate a transform on a {@link Preference}'s value. These transformations are
 * typically applied to values before they are used to compute a correlation value. They are typically not
 * applied elsewhere; in particular {@link org.apache.mahout.cf.taste.model.DataModel}s no longer use a transform
 * like this to transform all of their preference values at the source.</p>
 */
public interface PreferenceTransform extends Refreshable {

  double getTransformedValue(Preference pref) throws TasteException;

}