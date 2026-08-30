package com.google.common.eventbus;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
final class SubscriberRegistry {
    private final com.google.common.eventbus.EventBus bus;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>> subscribers = com.google.common.collect.Maps.newConcurrentMap();
    private static final com.google.common.cache.LoadingCache<java.lang.Class<?>, com.google.common.collect.ImmutableList<java.lang.reflect.Method>> subscriberMethodsCache = com.google.common.cache.CacheBuilder.newBuilder().weakKeys().build(new com.google.common.cache.CacheLoader<java.lang.Class<?>, com.google.common.collect.ImmutableList<java.lang.reflect.Method>>() { // from class: com.google.common.eventbus.SubscriberRegistry.1
        @Override // com.google.common.cache.CacheLoader
        public com.google.common.collect.ImmutableList<java.lang.reflect.Method> load(java.lang.Class<?> concreteClass) throws java.lang.Exception {
            return com.google.common.eventbus.SubscriberRegistry.getAnnotatedMethodsNotCached(concreteClass);
        }
    });
    private static final com.google.common.cache.LoadingCache<java.lang.Class<?>, com.google.common.collect.ImmutableSet<java.lang.Class<?>>> flattenHierarchyCache = com.google.common.cache.CacheBuilder.newBuilder().weakKeys().build(new com.google.common.cache.CacheLoader<java.lang.Class<?>, com.google.common.collect.ImmutableSet<java.lang.Class<?>>>() { // from class: com.google.common.eventbus.SubscriberRegistry.2
        @Override // com.google.common.cache.CacheLoader
        public com.google.common.collect.ImmutableSet<java.lang.Class<?>> load(java.lang.Class<?> concreteClass) {
            return com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) com.google.common.reflect.TypeToken.of((java.lang.Class) concreteClass).getTypes().rawTypes());
        }
    });

    SubscriberRegistry(com.google.common.eventbus.EventBus bus) {
        this.bus = (com.google.common.eventbus.EventBus) com.google.common.base.Preconditions.checkNotNull(bus);
    }

    void register(java.lang.Object listener) {
        for (java.util.Map.Entry<java.lang.Class<?>, java.util.Collection<com.google.common.eventbus.Subscriber>> entry : findAllSubscribers(listener).asMap().entrySet()) {
            java.lang.Class<?> key = entry.getKey();
            java.util.Collection<com.google.common.eventbus.Subscriber> value = entry.getValue();
            java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber> copyOnWriteArraySet = this.subscribers.get(key);
            if (copyOnWriteArraySet == null) {
                java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber> copyOnWriteArraySet2 = new java.util.concurrent.CopyOnWriteArraySet<>();
                copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) com.google.common.base.MoreObjects.firstNonNull(this.subscribers.putIfAbsent(key, copyOnWriteArraySet2), copyOnWriteArraySet2);
            }
            copyOnWriteArraySet.addAll(value);
        }
    }

    void unregister(java.lang.Object listener) {
        for (java.util.Map.Entry<java.lang.Class<?>, java.util.Collection<com.google.common.eventbus.Subscriber>> entry : findAllSubscribers(listener).asMap().entrySet()) {
            java.lang.Class<?> key = entry.getKey();
            java.util.Collection<com.google.common.eventbus.Subscriber> value = entry.getValue();
            java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber> copyOnWriteArraySet = this.subscribers.get(key);
            if (copyOnWriteArraySet == null || !copyOnWriteArraySet.removeAll(value)) {
                throw new java.lang.IllegalArgumentException("missing event subscriber for an annotated method. Is " + listener + " registered?");
            }
        }
    }

    java.util.Set<com.google.common.eventbus.Subscriber> getSubscribersForTesting(java.lang.Class<?> eventType) {
        return (java.util.Set) com.google.common.base.MoreObjects.firstNonNull(this.subscribers.get(eventType), com.google.common.collect.ImmutableSet.of());
    }

    java.util.Iterator<com.google.common.eventbus.Subscriber> getSubscribers(java.lang.Object event) {
        com.google.common.collect.ImmutableSet<java.lang.Class<?>> immutableSetFlattenHierarchy = flattenHierarchy(event.getClass());
        java.util.ArrayList arrayListNewArrayListWithCapacity = com.google.common.collect.Lists.newArrayListWithCapacity(immutableSetFlattenHierarchy.size());
        com.google.common.collect.UnmodifiableIterator<java.lang.Class<?>> it = immutableSetFlattenHierarchy.iterator();
        while (it.hasNext()) {
            java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber> copyOnWriteArraySet = this.subscribers.get(it.next());
            if (copyOnWriteArraySet != null) {
                arrayListNewArrayListWithCapacity.add(copyOnWriteArraySet.iterator());
            }
        }
        return com.google.common.collect.Iterators.concat(arrayListNewArrayListWithCapacity.iterator());
    }

    private com.google.common.collect.Multimap<java.lang.Class<?>, com.google.common.eventbus.Subscriber> findAllSubscribers(java.lang.Object listener) {
        com.google.common.collect.HashMultimap hashMultimapCreate = com.google.common.collect.HashMultimap.create();
        com.google.common.collect.UnmodifiableIterator<java.lang.reflect.Method> it = getAnnotatedMethods(listener.getClass()).iterator();
        while (it.hasNext()) {
            java.lang.reflect.Method next = it.next();
            hashMultimapCreate.put(next.getParameterTypes()[0], com.google.common.eventbus.Subscriber.create(this.bus, listener, next));
        }
        return hashMultimapCreate;
    }

    private static com.google.common.collect.ImmutableList<java.lang.reflect.Method> getAnnotatedMethods(java.lang.Class<?> clazz) {
        try {
            return subscriberMethodsCache.getUnchecked(clazz);
        } catch (com.google.common.util.concurrent.UncheckedExecutionException e) {
            com.google.common.base.Throwables.throwIfUnchecked(e.getCause());
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.common.collect.ImmutableList<java.lang.reflect.Method> getAnnotatedMethodsNotCached(java.lang.Class<?> clazz) {
        java.util.Set setRawTypes = com.google.common.reflect.TypeToken.of((java.lang.Class) clazz).getTypes().rawTypes();
        java.util.HashMap mapNewHashMap = com.google.common.collect.Maps.newHashMap();
        java.util.Iterator it = setRawTypes.iterator();
        while (it.hasNext()) {
            for (java.lang.reflect.Method method : ((java.lang.Class) it.next()).getDeclaredMethods()) {
                if (method.isAnnotationPresent(com.google.common.eventbus.Subscribe.class) && !method.isSynthetic()) {
                    java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                    com.google.common.base.Preconditions.checkArgument(parameterTypes.length == 1, "Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", (java.lang.Object) method, parameterTypes.length);
                    com.google.common.base.Preconditions.checkArgument(!parameterTypes[0].isPrimitive(), "@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, parameterTypes[0].getName(), com.google.common.primitives.Primitives.wrap(parameterTypes[0]).getSimpleName());
                    com.google.common.eventbus.SubscriberRegistry.MethodIdentifier methodIdentifier = new com.google.common.eventbus.SubscriberRegistry.MethodIdentifier(method);
                    if (!mapNewHashMap.containsKey(methodIdentifier)) {
                        mapNewHashMap.put(methodIdentifier, method);
                    }
                }
            }
        }
        return com.google.common.collect.ImmutableList.copyOf(mapNewHashMap.values());
    }

    static com.google.common.collect.ImmutableSet<java.lang.Class<?>> flattenHierarchy(java.lang.Class<?> concreteClass) {
        try {
            return flattenHierarchyCache.getUnchecked(concreteClass);
        } catch (com.google.common.util.concurrent.UncheckedExecutionException e) {
            throw com.google.common.base.Throwables.propagate(e.getCause());
        }
    }

    private static final class MethodIdentifier {
        private final java.lang.String name;
        private final java.util.List<java.lang.Class<?>> parameterTypes;

        MethodIdentifier(java.lang.reflect.Method method) {
            this.name = method.getName();
            this.parameterTypes = java.util.Arrays.asList(method.getParameterTypes());
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(this.name, this.parameterTypes);
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!(o instanceof com.google.common.eventbus.SubscriberRegistry.MethodIdentifier)) {
                return false;
            }
            com.google.common.eventbus.SubscriberRegistry.MethodIdentifier methodIdentifier = (com.google.common.eventbus.SubscriberRegistry.MethodIdentifier) o;
            return this.name.equals(methodIdentifier.name) && this.parameterTypes.equals(methodIdentifier.parameterTypes);
        }
    }
}
