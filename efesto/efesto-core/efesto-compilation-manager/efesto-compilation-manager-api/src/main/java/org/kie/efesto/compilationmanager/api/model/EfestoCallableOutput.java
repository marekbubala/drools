/*
 * Copyright 2022 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.efesto.compilationmanager.api.model;

import org.kie.efesto.common.api.model.FRI;

import java.util.List;

/**
 * A <code>CompilationOutput</code>.
 *
 * It will be translated to a <code>GeneratedExecutableResource</code>,
 * that has a specif json-format and semantic.
 */
public interface EfestoCallableOutput extends EfestoCompilationOutput {

    /**
     * Returns the <b>full resource identifier</b> to be invoked for execution
     *
     * @return
     */
    FRI getFri();

    /**
     * Returns the <b>full class names</b> to be instantiated for execution
     *
     * @return
     */
    List<String> getFullClassNames();
}
