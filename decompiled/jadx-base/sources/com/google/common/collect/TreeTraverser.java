package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
@java.lang.Deprecated
public abstract class TreeTraverser<T> {
    public abstract java.lang.Iterable<T> children(T root);

    @java.lang.Deprecated
    public static <T> com.google.common.collect.TreeTraverser<T> using(final com.google.common.base.Function<T, ? extends java.lang.Iterable<T>> nodeToChildrenFunction) {
        com.google.common.base.Preconditions.checkNotNull(nodeToChildrenFunction);
        return new com.google.common.collect.TreeTraverser<T>() { // from class: com.google.common.collect.TreeTraverser.1
            @Override // com.google.common.collect.TreeTraverser
            public java.lang.Iterable<T> children(T root) {
                return (java.lang.Iterable) nodeToChildrenFunction.apply(root);
            }
        };
    }

    @java.lang.Deprecated
    public final com.google.common.collect.FluentIterable<T> preOrderTraversal(final T root) {
        com.google.common.base.Preconditions.checkNotNull(root);
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.TreeTraverser.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Iterable
            public com.google.common.collect.UnmodifiableIterator<T> iterator() {
                return com.google.common.collect.TreeTraverser.this.preOrderIterator(root);
            }
        };
    }

    com.google.common.collect.UnmodifiableIterator<T> preOrderIterator(T root) {
        return new com.google.common.collect.TreeTraverser.PreOrderIterator(root);
    }

    private final class PreOrderIterator extends com.google.common.collect.UnmodifiableIterator<T> {
        private final java.util.Deque<java.util.Iterator<T>> stack;

        PreOrderIterator(T root) {
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            this.stack = arrayDeque;
            arrayDeque.addLast(com.google.common.collect.Iterators.singletonIterator(com.google.common.base.Preconditions.checkNotNull(root)));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.stack.isEmpty();
        }

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
        @Override // java.util.Iterator
        public T next() {
            java.util.Iterator<T> last = this.stack.getLast();
            T t = (T) com.google.common.base.Preconditions.checkNotNull(last.next());
            if (!last.hasNext()) {
                this.stack.removeLast();
            }
            java.util.Iterator<T> it = com.google.common.collect.TreeTraverser.this.children(t).iterator();
            if (it.hasNext()) {
                this.stack.addLast(it);
            }
            return t;
        }
    }

    @java.lang.Deprecated
    public final com.google.common.collect.FluentIterable<T> postOrderTraversal(final T root) {
        com.google.common.base.Preconditions.checkNotNull(root);
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.TreeTraverser.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Iterable
            public com.google.common.collect.UnmodifiableIterator<T> iterator() {
                return com.google.common.collect.TreeTraverser.this.postOrderIterator(root);
            }
        };
    }

    com.google.common.collect.UnmodifiableIterator<T> postOrderIterator(T root) {
        return new com.google.common.collect.TreeTraverser.PostOrderIterator(root);
    }

    private static final class PostOrderNode<T> {
        final java.util.Iterator<T> childIterator;
        final T root;

        PostOrderNode(T t, java.util.Iterator<T> it) {
            this.root = (T) com.google.common.base.Preconditions.checkNotNull(t);
            this.childIterator = (java.util.Iterator) com.google.common.base.Preconditions.checkNotNull(it);
        }
    }

    private final class PostOrderIterator extends com.google.common.collect.AbstractIterator<T> {
        private final java.util.ArrayDeque<com.google.common.collect.TreeTraverser.PostOrderNode<T>> stack;

        PostOrderIterator(T root) {
            java.util.ArrayDeque<com.google.common.collect.TreeTraverser.PostOrderNode<T>> arrayDeque = new java.util.ArrayDeque<>();
            this.stack = arrayDeque;
            arrayDeque.addLast(expand(root));
        }

        @Override // com.google.common.collect.AbstractIterator
        @javax.annotation.CheckForNull
        protected T computeNext() {
            while (!this.stack.isEmpty()) {
                com.google.common.collect.TreeTraverser.PostOrderNode<T> last = this.stack.getLast();
                if (last.childIterator.hasNext()) {
                    this.stack.addLast(expand(last.childIterator.next()));
                } else {
                    this.stack.removeLast();
                    return last.root;
                }
            }
            return endOfData();
        }

        private com.google.common.collect.TreeTraverser.PostOrderNode<T> expand(T t) {
            return new com.google.common.collect.TreeTraverser.PostOrderNode<>(t, com.google.common.collect.TreeTraverser.this.children(t).iterator());
        }
    }

    @java.lang.Deprecated
    public final com.google.common.collect.FluentIterable<T> breadthFirstTraversal(final T root) {
        com.google.common.base.Preconditions.checkNotNull(root);
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.TreeTraverser.4
            @Override // java.lang.Iterable
            public com.google.common.collect.UnmodifiableIterator<T> iterator() {
                return new com.google.common.collect.TreeTraverser.BreadthFirstIterator(root);
            }
        };
    }

    private final class BreadthFirstIterator extends com.google.common.collect.UnmodifiableIterator<T> implements com.google.common.collect.PeekingIterator<T> {
        private final java.util.Queue<T> queue;

        BreadthFirstIterator(T root) {
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            this.queue = arrayDeque;
            arrayDeque.add(root);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.queue.isEmpty();
        }

        @Override // com.google.common.collect.PeekingIterator
        public T peek() {
            return this.queue.element();
        }

        @Override // java.util.Iterator, com.google.common.collect.PeekingIterator
        public T next() {
            T tRemove = this.queue.remove();
            com.google.common.collect.Iterables.addAll(this.queue, com.google.common.collect.TreeTraverser.this.children(tRemove));
            return tRemove;
        }
    }
}
