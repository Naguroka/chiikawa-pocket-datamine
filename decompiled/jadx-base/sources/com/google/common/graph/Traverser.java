package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
@com.google.common.graph.ElementTypesAreNonnullByDefault
public abstract class Traverser<N> {
    private final com.google.common.graph.SuccessorsFunction<N> successorFunction;

    private enum InsertionOrder {
        FRONT { // from class: com.google.common.graph.Traverser.InsertionOrder.1
            @Override // com.google.common.graph.Traverser.InsertionOrder
            <T> void insertInto(java.util.Deque<T> deque, T value) {
                deque.addFirst(value);
            }
        },
        BACK { // from class: com.google.common.graph.Traverser.InsertionOrder.2
            @Override // com.google.common.graph.Traverser.InsertionOrder
            <T> void insertInto(java.util.Deque<T> deque, T value) {
                deque.addLast(value);
            }
        };

        abstract <T> void insertInto(java.util.Deque<T> deque, T value);
    }

    abstract com.google.common.graph.Traverser.Traversal<N> newTraversal();

    private Traverser(com.google.common.graph.SuccessorsFunction<N> successorFunction) {
        this.successorFunction = (com.google.common.graph.SuccessorsFunction) com.google.common.base.Preconditions.checkNotNull(successorFunction);
    }

    public static <N> com.google.common.graph.Traverser<N> forGraph(final com.google.common.graph.SuccessorsFunction<N> graph) {
        return new com.google.common.graph.Traverser<N>(graph) { // from class: com.google.common.graph.Traverser.1
            @Override // com.google.common.graph.Traverser
            com.google.common.graph.Traverser.Traversal<N> newTraversal() {
                return com.google.common.graph.Traverser.Traversal.inGraph(graph);
            }
        };
    }

    public static <N> com.google.common.graph.Traverser<N> forTree(final com.google.common.graph.SuccessorsFunction<N> tree) {
        if (tree instanceof com.google.common.graph.BaseGraph) {
            com.google.common.base.Preconditions.checkArgument(((com.google.common.graph.BaseGraph) tree).isDirected(), "Undirected graphs can never be trees.");
        }
        if (tree instanceof com.google.common.graph.Network) {
            com.google.common.base.Preconditions.checkArgument(((com.google.common.graph.Network) tree).isDirected(), "Undirected networks can never be trees.");
        }
        return new com.google.common.graph.Traverser<N>(tree) { // from class: com.google.common.graph.Traverser.2
            @Override // com.google.common.graph.Traverser
            com.google.common.graph.Traverser.Traversal<N> newTraversal() {
                return com.google.common.graph.Traverser.Traversal.inTree(tree);
            }
        };
    }

    public final java.lang.Iterable<N> breadthFirst(N startNode) {
        return breadthFirst((java.lang.Iterable) com.google.common.collect.ImmutableSet.of(startNode));
    }

    public final java.lang.Iterable<N> breadthFirst(java.lang.Iterable<? extends N> startNodes) {
        final com.google.common.collect.ImmutableSet<N> immutableSetValidate = validate(startNodes);
        return new java.lang.Iterable<N>() { // from class: com.google.common.graph.Traverser.3
            @Override // java.lang.Iterable
            public java.util.Iterator<N> iterator() {
                return com.google.common.graph.Traverser.this.newTraversal().breadthFirst(immutableSetValidate.iterator());
            }
        };
    }

    public final java.lang.Iterable<N> depthFirstPreOrder(N startNode) {
        return depthFirstPreOrder((java.lang.Iterable) com.google.common.collect.ImmutableSet.of(startNode));
    }

    public final java.lang.Iterable<N> depthFirstPreOrder(java.lang.Iterable<? extends N> startNodes) {
        final com.google.common.collect.ImmutableSet<N> immutableSetValidate = validate(startNodes);
        return new java.lang.Iterable<N>() { // from class: com.google.common.graph.Traverser.4
            @Override // java.lang.Iterable
            public java.util.Iterator<N> iterator() {
                return com.google.common.graph.Traverser.this.newTraversal().preOrder(immutableSetValidate.iterator());
            }
        };
    }

    public final java.lang.Iterable<N> depthFirstPostOrder(N startNode) {
        return depthFirstPostOrder((java.lang.Iterable) com.google.common.collect.ImmutableSet.of(startNode));
    }

    public final java.lang.Iterable<N> depthFirstPostOrder(java.lang.Iterable<? extends N> startNodes) {
        final com.google.common.collect.ImmutableSet<N> immutableSetValidate = validate(startNodes);
        return new java.lang.Iterable<N>() { // from class: com.google.common.graph.Traverser.5
            @Override // java.lang.Iterable
            public java.util.Iterator<N> iterator() {
                return com.google.common.graph.Traverser.this.newTraversal().postOrder(immutableSetValidate.iterator());
            }
        };
    }

    private com.google.common.collect.ImmutableSet<N> validate(java.lang.Iterable<? extends N> startNodes) {
        com.google.common.collect.ImmutableSet<N> immutableSetCopyOf = com.google.common.collect.ImmutableSet.copyOf(startNodes);
        com.google.common.collect.UnmodifiableIterator<N> it = immutableSetCopyOf.iterator();
        while (it.hasNext()) {
            this.successorFunction.successors(it.next());
        }
        return immutableSetCopyOf;
    }

    private static abstract class Traversal<N> {
        final com.google.common.graph.SuccessorsFunction<N> successorFunction;

        @javax.annotation.CheckForNull
        abstract N visitNext(java.util.Deque<java.util.Iterator<? extends N>> horizon);

        Traversal(com.google.common.graph.SuccessorsFunction<N> successorFunction) {
            this.successorFunction = successorFunction;
        }

        static <N> com.google.common.graph.Traverser.Traversal<N> inGraph(com.google.common.graph.SuccessorsFunction<N> graph) {
            final java.util.HashSet hashSet = new java.util.HashSet();
            return new com.google.common.graph.Traverser.Traversal<N>(graph) { // from class: com.google.common.graph.Traverser.Traversal.1
                @Override // com.google.common.graph.Traverser.Traversal
                @javax.annotation.CheckForNull
                N visitNext(java.util.Deque<java.util.Iterator<? extends N>> horizon) {
                    java.util.Iterator<? extends N> first = horizon.getFirst();
                    while (first.hasNext()) {
                        N next = first.next();
                        java.util.Objects.requireNonNull(next);
                        if (hashSet.add(next)) {
                            return next;
                        }
                    }
                    horizon.removeFirst();
                    return null;
                }
            };
        }

        static <N> com.google.common.graph.Traverser.Traversal<N> inTree(com.google.common.graph.SuccessorsFunction<N> tree) {
            return new com.google.common.graph.Traverser.Traversal<N>(tree) { // from class: com.google.common.graph.Traverser.Traversal.2
                @Override // com.google.common.graph.Traverser.Traversal
                @javax.annotation.CheckForNull
                N visitNext(java.util.Deque<java.util.Iterator<? extends N>> deque) {
                    java.util.Iterator<? extends N> first = deque.getFirst();
                    if (first.hasNext()) {
                        return (N) com.google.common.base.Preconditions.checkNotNull(first.next());
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        final java.util.Iterator<N> breadthFirst(java.util.Iterator<? extends N> startNodes) {
            return topDown(startNodes, com.google.common.graph.Traverser.InsertionOrder.BACK);
        }

        final java.util.Iterator<N> preOrder(java.util.Iterator<? extends N> startNodes) {
            return topDown(startNodes, com.google.common.graph.Traverser.InsertionOrder.FRONT);
        }

        private java.util.Iterator<N> topDown(java.util.Iterator<? extends N> startNodes, final com.google.common.graph.Traverser.InsertionOrder order) {
            final java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            arrayDeque.add(startNodes);
            return new com.google.common.collect.AbstractIterator<N>() { // from class: com.google.common.graph.Traverser.Traversal.3
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.google.common.collect.AbstractIterator
                @javax.annotation.CheckForNull
                protected N computeNext() {
                    do {
                        N n = (N) com.google.common.graph.Traverser.Traversal.this.visitNext(arrayDeque);
                        if (n != null) {
                            java.util.Iterator<? extends N> it = com.google.common.graph.Traverser.Traversal.this.successorFunction.successors(n).iterator();
                            if (it.hasNext()) {
                                order.insertInto(arrayDeque, it);
                            }
                            return n;
                        }
                    } while (!arrayDeque.isEmpty());
                    return endOfData();
                }
            };
        }

        final java.util.Iterator<N> postOrder(java.util.Iterator<? extends N> startNodes) {
            final java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            final java.util.ArrayDeque arrayDeque2 = new java.util.ArrayDeque();
            arrayDeque2.add(startNodes);
            return new com.google.common.collect.AbstractIterator<N>() { // from class: com.google.common.graph.Traverser.Traversal.4
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.google.common.collect.AbstractIterator
                @javax.annotation.CheckForNull
                protected N computeNext() {
                    while (true) {
                        N n = (N) com.google.common.graph.Traverser.Traversal.this.visitNext(arrayDeque2);
                        if (n != null) {
                            java.util.Iterator<? extends N> it = com.google.common.graph.Traverser.Traversal.this.successorFunction.successors(n).iterator();
                            if (!it.hasNext()) {
                                return n;
                            }
                            arrayDeque2.addFirst(it);
                            arrayDeque.push(n);
                        } else {
                            if (!arrayDeque.isEmpty()) {
                                return (N) arrayDeque.pop();
                            }
                            return endOfData();
                        }
                    }
                }
            };
        }
    }
}
