package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
class CycleDetector {

    private static class Dep {
        private final com.google.firebase.components.Qualified<?> anInterface;
        private final boolean set;

        private Dep(com.google.firebase.components.Qualified<?> qualified, boolean z) {
            this.anInterface = qualified;
            this.set = z;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.firebase.components.CycleDetector.Dep)) {
                return false;
            }
            com.google.firebase.components.CycleDetector.Dep dep = (com.google.firebase.components.CycleDetector.Dep) obj;
            return dep.anInterface.equals(this.anInterface) && dep.set == this.set;
        }

        public int hashCode() {
            return ((this.anInterface.hashCode() ^ 1000003) * 1000003) ^ java.lang.Boolean.valueOf(this.set).hashCode();
        }
    }

    CycleDetector() {
    }

    private static class ComponentNode {
        private final com.google.firebase.components.Component<?> component;
        private final java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> dependencies = new java.util.HashSet();
        private final java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> dependents = new java.util.HashSet();

        ComponentNode(com.google.firebase.components.Component<?> component) {
            this.component = component;
        }

        void addDependency(com.google.firebase.components.CycleDetector.ComponentNode componentNode) {
            this.dependencies.add(componentNode);
        }

        void addDependent(com.google.firebase.components.CycleDetector.ComponentNode componentNode) {
            this.dependents.add(componentNode);
        }

        java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> getDependencies() {
            return this.dependencies;
        }

        void removeDependent(com.google.firebase.components.CycleDetector.ComponentNode componentNode) {
            this.dependents.remove(componentNode);
        }

        com.google.firebase.components.Component<?> getComponent() {
            return this.component;
        }

        boolean isRoot() {
            return this.dependents.isEmpty();
        }

        boolean isLeaf() {
            return this.dependencies.isEmpty();
        }
    }

    static void detect(java.util.List<com.google.firebase.components.Component<?>> list) {
        java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> graph = toGraph(list);
        java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> roots = getRoots(graph);
        int i = 0;
        while (!roots.isEmpty()) {
            com.google.firebase.components.CycleDetector.ComponentNode next = roots.iterator().next();
            roots.remove(next);
            i++;
            for (com.google.firebase.components.CycleDetector.ComponentNode componentNode : next.getDependencies()) {
                componentNode.removeDependent(next);
                if (componentNode.isRoot()) {
                    roots.add(componentNode);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.firebase.components.CycleDetector.ComponentNode componentNode2 : graph) {
            if (!componentNode2.isRoot() && !componentNode2.isLeaf()) {
                arrayList.add(componentNode2.getComponent());
            }
        }
        throw new com.google.firebase.components.DependencyCycleException(arrayList);
    }

    private static java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> toGraph(java.util.List<com.google.firebase.components.Component<?>> list) {
        java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> set;
        java.util.HashMap map = new java.util.HashMap(list.size());
        java.util.Iterator<com.google.firebase.components.Component<?>> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                com.google.firebase.components.Component<?> next = it.next();
                com.google.firebase.components.CycleDetector.ComponentNode componentNode = new com.google.firebase.components.CycleDetector.ComponentNode(next);
                for (com.google.firebase.components.Qualified<? super java.lang.Object> qualified : next.getProvidedInterfaces()) {
                    com.google.firebase.components.CycleDetector.Dep dep = new com.google.firebase.components.CycleDetector.Dep(qualified, !next.isValue());
                    if (!map.containsKey(dep)) {
                        map.put(dep, new java.util.HashSet());
                    }
                    java.util.Set set2 = (java.util.Set) map.get(dep);
                    if (!set2.isEmpty() && !dep.set) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Multiple components provide %s.", qualified));
                    }
                    set2.add(componentNode);
                }
            } else {
                java.util.Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (com.google.firebase.components.CycleDetector.ComponentNode componentNode2 : (java.util.Set) it2.next()) {
                        for (com.google.firebase.components.Dependency dependency : componentNode2.getComponent().getDependencies()) {
                            if (dependency.isDirectInjection() && (set = (java.util.Set) map.get(new com.google.firebase.components.CycleDetector.Dep(dependency.getInterface(), dependency.isSet()))) != null) {
                                for (com.google.firebase.components.CycleDetector.ComponentNode componentNode3 : set) {
                                    componentNode2.addDependency(componentNode3);
                                    componentNode3.addDependent(componentNode2);
                                }
                            }
                        }
                    }
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((java.util.Set) it3.next());
                }
                return hashSet;
            }
        }
    }

    private static java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> getRoots(java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> set) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (com.google.firebase.components.CycleDetector.ComponentNode componentNode : set) {
            if (componentNode.isRoot()) {
                hashSet.add(componentNode);
            }
        }
        return hashSet;
    }
}
