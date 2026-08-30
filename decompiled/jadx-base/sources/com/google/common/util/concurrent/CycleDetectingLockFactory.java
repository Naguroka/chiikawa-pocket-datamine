package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public class CycleDetectingLockFactory {
    final com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy;
    private static final java.util.concurrent.ConcurrentMap<java.lang.Class<? extends java.lang.Enum<?>>, java.util.Map<? extends java.lang.Enum<?>, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>> lockGraphNodesPerType = new com.google.common.collect.MapMaker().weakKeys().makeMap();
    private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.CycleDetectingLockFactory.class);
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>> acquiredLocks = new java.lang.ThreadLocal<java.util.ArrayList<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>>() { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.util.ArrayList<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> initialValue() {
            return com.google.common.collect.Lists.newArrayListWithCapacity(3);
        }
    };

    private interface CycleDetectingLock {
        com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    public enum Policies implements com.google.common.util.concurrent.CycleDetectingLockFactory.Policy {
        THROW { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.1
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException e) {
                throw e;
            }
        },
        WARN { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.2
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException e) {
                com.google.common.util.concurrent.CycleDetectingLockFactory.logger.get().log(java.util.logging.Level.SEVERE, "Detected potential deadlock", (java.lang.Throwable) e);
            }
        },
        DISABLED { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.3
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public void handlePotentialDeadlock(com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException e) {
            }
        }
    }

    public interface Policy {
        void handlePotentialDeadlock(com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException exception);
    }

    public static com.google.common.util.concurrent.CycleDetectingLockFactory newInstance(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy) {
        return new com.google.common.util.concurrent.CycleDetectingLockFactory(policy);
    }

    public java.util.concurrent.locks.ReentrantLock newReentrantLock(java.lang.String lockName) {
        return newReentrantLock(lockName, false);
    }

    public java.util.concurrent.locks.ReentrantLock newReentrantLock(java.lang.String lockName, boolean fair) {
        if (this.policy == com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED) {
            return new java.util.concurrent.locks.ReentrantLock(fair);
        }
        return new com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantLock(new com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode(lockName), fair);
    }

    public java.util.concurrent.locks.ReentrantReadWriteLock newReentrantReadWriteLock(java.lang.String lockName) {
        return newReentrantReadWriteLock(lockName, false);
    }

    public java.util.concurrent.locks.ReentrantReadWriteLock newReentrantReadWriteLock(java.lang.String lockName, boolean fair) {
        if (this.policy == com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED) {
            return new java.util.concurrent.locks.ReentrantReadWriteLock(fair);
        }
        return new com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock(new com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode(lockName), fair);
    }

    public static <E extends java.lang.Enum<E>> com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering<E> newInstanceWithExplicitOrdering(java.lang.Class<E> enumClass, com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy) {
        com.google.common.base.Preconditions.checkNotNull(enumClass);
        com.google.common.base.Preconditions.checkNotNull(policy);
        return new com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering<>(policy, getOrCreateNodes(enumClass));
    }

    private static <E extends java.lang.Enum<E>> java.util.Map<? extends E, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> getOrCreateNodes(java.lang.Class<E> clazz) {
        java.util.concurrent.ConcurrentMap<java.lang.Class<? extends java.lang.Enum<?>>, java.util.Map<? extends java.lang.Enum<?>, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>> concurrentMap = lockGraphNodesPerType;
        java.util.Map<? extends E, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> map = (java.util.Map) concurrentMap.get(clazz);
        if (map != null) {
            return map;
        }
        java.util.Map<? extends java.lang.Enum<?>, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> mapCreateNodes = createNodes(clazz);
        return (java.util.Map) com.google.common.base.MoreObjects.firstNonNull(concurrentMap.putIfAbsent(clazz, mapCreateNodes), mapCreateNodes);
    }

    static <E extends java.lang.Enum<E>> java.util.Map<E, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> createNodes(java.lang.Class<E> clazz) {
        java.util.EnumMap enumMapNewEnumMap = com.google.common.collect.Maps.newEnumMap(clazz);
        E[] enumConstants = clazz.getEnumConstants();
        int length = enumConstants.length;
        java.util.ArrayList arrayListNewArrayListWithCapacity = com.google.common.collect.Lists.newArrayListWithCapacity(length);
        int i = 0;
        for (E e : enumConstants) {
            com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode = new com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode(getLockName(e));
            arrayListNewArrayListWithCapacity.add(lockGraphNode);
            enumMapNewEnumMap.put(e, lockGraphNode);
        }
        for (int i2 = 1; i2 < length; i2++) {
            ((com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) arrayListNewArrayListWithCapacity.get(i2)).checkAcquiredLocks(com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.THROW, arrayListNewArrayListWithCapacity.subList(0, i2));
        }
        while (i < length - 1) {
            i++;
            ((com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) arrayListNewArrayListWithCapacity.get(i)).checkAcquiredLocks(com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED, arrayListNewArrayListWithCapacity.subList(i, length));
        }
        return java.util.Collections.unmodifiableMap(enumMapNewEnumMap);
    }

    private static java.lang.String getLockName(java.lang.Enum<?> rank) {
        return rank.getDeclaringClass().getSimpleName() + "." + rank.name();
    }

    public static final class WithExplicitOrdering<E extends java.lang.Enum<E>> extends com.google.common.util.concurrent.CycleDetectingLockFactory {
        private final java.util.Map<E, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> lockGraphNodes;

        WithExplicitOrdering(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy, java.util.Map<E, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> lockGraphNodes) {
            super(policy);
            this.lockGraphNodes = lockGraphNodes;
        }

        public java.util.concurrent.locks.ReentrantLock newReentrantLock(E rank) {
            return newReentrantLock((java.lang.Enum) rank, false);
        }

        public java.util.concurrent.locks.ReentrantLock newReentrantLock(E rank, boolean fair) {
            if (this.policy == com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED) {
                return new java.util.concurrent.locks.ReentrantLock(fair);
            }
            return new com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantLock((com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) java.util.Objects.requireNonNull(this.lockGraphNodes.get(rank)), fair);
        }

        public java.util.concurrent.locks.ReentrantReadWriteLock newReentrantReadWriteLock(E rank) {
            return newReentrantReadWriteLock((java.lang.Enum) rank, false);
        }

        public java.util.concurrent.locks.ReentrantReadWriteLock newReentrantReadWriteLock(E rank, boolean fair) {
            if (this.policy == com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED) {
                return new java.util.concurrent.locks.ReentrantReadWriteLock(fair);
            }
            return new com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock((com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) java.util.Objects.requireNonNull(this.lockGraphNodes.get(rank)), fair);
        }
    }

    private CycleDetectingLockFactory(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy) {
        this.policy = (com.google.common.util.concurrent.CycleDetectingLockFactory.Policy) com.google.common.base.Preconditions.checkNotNull(policy);
    }

    private static class ExampleStackTrace extends java.lang.IllegalStateException {
        static final java.lang.StackTraceElement[] EMPTY_STACK_TRACE = new java.lang.StackTraceElement[0];
        static final com.google.common.collect.ImmutableSet<java.lang.String> EXCLUDED_CLASS_NAMES = com.google.common.collect.ImmutableSet.of(com.google.common.util.concurrent.CycleDetectingLockFactory.class.getName(), com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace.class.getName(), com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode.class.getName());

        ExampleStackTrace(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode node1, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode node2) {
            super(node1.getLockName() + " -> " + node2.getLockName());
            java.lang.StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                if (com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering.class.getName().equals(stackTrace[i].getClassName())) {
                    setStackTrace(EMPTY_STACK_TRACE);
                    return;
                } else {
                    if (!EXCLUDED_CLASS_NAMES.contains(stackTrace[i].getClassName())) {
                        setStackTrace((java.lang.StackTraceElement[]) java.util.Arrays.copyOfRange(stackTrace, i, length));
                        return;
                    }
                }
            }
        }
    }

    public static final class PotentialDeadlockException extends com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace {
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace conflictingStackTrace;

        private PotentialDeadlockException(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode node1, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode node2, com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace conflictingStackTrace) {
            super(node1, node2);
            this.conflictingStackTrace = conflictingStackTrace;
            initCause(conflictingStackTrace);
        }

        public com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace getConflictingStackTrace() {
            return this.conflictingStackTrace;
        }

        @Override // java.lang.Throwable
        public java.lang.String getMessage() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder((java.lang.String) java.util.Objects.requireNonNull(super.getMessage()));
            for (java.lang.Throwable cause = this.conflictingStackTrace; cause != null; cause = cause.getCause()) {
                sb.append(", ").append(cause.getMessage());
            }
            return sb.toString();
        }
    }

    private static class LockGraphNode {
        final java.util.Map<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace> allowedPriorLocks = new com.google.common.collect.MapMaker().weakKeys().makeMap();
        final java.util.Map<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException> disallowedPriorLocks = new com.google.common.collect.MapMaker().weakKeys().makeMap();
        final java.lang.String lockName;

        LockGraphNode(java.lang.String lockName) {
            this.lockName = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(lockName);
        }

        java.lang.String getLockName() {
            return this.lockName;
        }

        void checkAcquiredLocks(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy, java.util.List<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> acquiredLocks) {
            java.util.Iterator<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> it = acquiredLocks.iterator();
            while (it.hasNext()) {
                checkAcquiredLock(policy, it.next());
            }
        }

        void checkAcquiredLock(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode acquiredLock) {
            com.google.common.base.Preconditions.checkState(this != acquiredLock, "Attempted to acquire multiple locks with the same rank %s", acquiredLock.getLockName());
            if (this.allowedPriorLocks.containsKey(acquiredLock)) {
                return;
            }
            com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException potentialDeadlockException = this.disallowedPriorLocks.get(acquiredLock);
            if (potentialDeadlockException != null) {
                policy.handlePotentialDeadlock(new com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException(acquiredLock, this, potentialDeadlockException.getConflictingStackTrace()));
                return;
            }
            com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace exampleStackTraceFindPathTo = acquiredLock.findPathTo(this, com.google.common.collect.Sets.newIdentityHashSet());
            if (exampleStackTraceFindPathTo == null) {
                this.allowedPriorLocks.put(acquiredLock, new com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace(acquiredLock, this));
                return;
            }
            com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException potentialDeadlockException2 = new com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException(acquiredLock, this, exampleStackTraceFindPathTo);
            this.disallowedPriorLocks.put(acquiredLock, potentialDeadlockException2);
            policy.handlePotentialDeadlock(potentialDeadlockException2);
        }

        @javax.annotation.CheckForNull
        private com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace findPathTo(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode node, java.util.Set<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> seen) {
            if (!seen.add(this)) {
                return null;
            }
            com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace exampleStackTrace = this.allowedPriorLocks.get(node);
            if (exampleStackTrace != null) {
                return exampleStackTrace;
            }
            for (java.util.Map.Entry<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace> entry : this.allowedPriorLocks.entrySet()) {
                com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode key = entry.getKey();
                com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace exampleStackTraceFindPathTo = key.findPathTo(node, seen);
                if (exampleStackTraceFindPathTo != null) {
                    com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace exampleStackTrace2 = new com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace(key, this);
                    exampleStackTrace2.setStackTrace(entry.getValue().getStackTrace());
                    exampleStackTrace2.initCause(exampleStackTraceFindPathTo);
                    return exampleStackTrace2;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aboutToAcquire(com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock lock) {
        if (lock.isAcquiredByCurrentThread()) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) java.util.Objects.requireNonNull(acquiredLocks.get());
        com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode = lock.getLockGraphNode();
        lockGraphNode.checkAcquiredLocks(this.policy, arrayList);
        arrayList.add(lockGraphNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lockStateChanged(com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock lock) {
        if (lock.isAcquiredByCurrentThread()) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) java.util.Objects.requireNonNull(acquiredLocks.get());
        com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode = lock.getLockGraphNode();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == lockGraphNode) {
                arrayList.remove(size);
                return;
            }
        }
    }

    final class CycleDetectingReentrantLock extends java.util.concurrent.locks.ReentrantLock implements com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock {
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode;

        private CycleDetectingReentrantLock(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode, boolean fair) {
            super(fair);
            this.lockGraphNode = (com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) com.google.common.base.Preconditions.checkNotNull(lockGraphNode);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public boolean isAcquiredByCurrentThread() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this);
            try {
                super.lock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws java.lang.InterruptedException {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this);
            try {
                super.lockInterruptibly();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this);
            try {
                return super.tryLock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this);
            try {
                return super.tryLock(timeout, unit);
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this);
            }
        }
    }

    final class CycleDetectingReentrantReadWriteLock extends java.util.concurrent.locks.ReentrantReadWriteLock implements com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock {
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode;
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadLock readLock;
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantWriteLock writeLock;

        private CycleDetectingReentrantReadWriteLock(final com.google.common.util.concurrent.CycleDetectingLockFactory this$0, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode, boolean fair) {
            super(fair);
            this.readLock = this$0.new CycleDetectingReentrantReadLock(this);
            this.writeLock = this$0.new CycleDetectingReentrantWriteLock(this);
            this.lockGraphNode = (com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) com.google.common.base.Preconditions.checkNotNull(lockGraphNode);
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock() {
            return this.readLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock() {
            return this.writeLock;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public boolean isAcquiredByCurrentThread() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }
    }

    private class CycleDetectingReentrantReadLock extends java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock {
        final com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock readWriteLock;

        CycleDetectingReentrantReadLock(com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock readWriteLock) {
            super(readWriteLock);
            this.readWriteLock = readWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                super.lock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws java.lang.InterruptedException {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                return super.tryLock(timeout, unit);
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }
    }

    private class CycleDetectingReentrantWriteLock extends java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock {
        final com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock readWriteLock;

        CycleDetectingReentrantWriteLock(com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock readWriteLock) {
            super(readWriteLock);
            this.readWriteLock = readWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                super.lock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws java.lang.InterruptedException {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                return super.tryLock(timeout, unit);
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }
    }
}
