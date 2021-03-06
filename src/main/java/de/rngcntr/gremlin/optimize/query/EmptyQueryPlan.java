// Copyright 2020 Florian Grieskamp
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package de.rngcntr.gremlin.optimize.query;

import de.rngcntr.gremlin.optimize.structure.PatternElement;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.DefaultGraphTraversal;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal;

import java.util.Collections;
import java.util.Set;

public class EmptyQueryPlan implements PartialQueryPlan {
    @Override
    public Set<PatternElement<?>> getElements() {
        return Collections.emptySet();
    }

    @Override
    public GraphTraversal<Object, Object> asTraversal() {
        return new DefaultGraphTraversal<>();
    }

    @Override
    public Set<PartialQueryPlan> generalCut(Set<PatternElement<?>> elementsToKeep) {
        return Collections.emptySet();
    }

    @Override
    public Set<DependencyTree> explicitCut(Set<PatternElement<?>> elementsToKeep) {
        return Collections.emptySet();
    }

    @Override
    public boolean isMovable() {
        return false;
    }

    @Override
    public String toString() {
        return "empty";
    }
}
