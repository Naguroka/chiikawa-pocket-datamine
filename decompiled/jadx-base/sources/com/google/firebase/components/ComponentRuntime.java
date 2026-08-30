package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
public class ComponentRuntime implements com.google.firebase.components.ComponentContainer, com.google.firebase.dynamicloading.ComponentLoader {
    private static final com.google.firebase.inject.Provider<java.util.Set<java.lang.Object>> EMPTY_PROVIDER = new com.google.firebase.inject.Provider() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda4
        @Override // com.google.firebase.inject.Provider
        public final java.lang.Object get() {
            return java.util.Collections.emptySet();
        }
    };
    private final com.google.firebase.components.ComponentRegistrarProcessor componentRegistrarProcessor;
    private final java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> components;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> eagerComponentsInitializedWith;
    private final com.google.firebase.components.EventBus eventBus;
    private final java.util.Map<com.google.firebase.components.Qualified<?>, com.google.firebase.inject.Provider<?>> lazyInstanceMap;
    private final java.util.Map<com.google.firebase.components.Qualified<?>, com.google.firebase.components.LazySet<?>> lazySetMap;
    private java.util.Set<java.lang.String> processedCoroutineDispatcherInterfaces;
    private final java.util.List<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> unprocessedRegistrarProviders;

    static /* synthetic */ com.google.firebase.components.ComponentRegistrar lambda$toProviders$1(com.google.firebase.components.ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    @java.lang.Deprecated
    public ComponentRuntime(java.util.concurrent.Executor executor, java.lang.Iterable<com.google.firebase.components.ComponentRegistrar> iterable, com.google.firebase.components.Component<?>... componentArr) {
        this(executor, toProviders(iterable), java.util.Arrays.asList(componentArr), com.google.firebase.components.ComponentRegistrarProcessor.NOOP);
    }

    public static com.google.firebase.components.ComponentRuntime.Builder builder(java.util.concurrent.Executor executor) {
        return new com.google.firebase.components.ComponentRuntime.Builder(executor);
    }

    private ComponentRuntime(java.util.concurrent.Executor executor, java.lang.Iterable<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> iterable, java.util.Collection<com.google.firebase.components.Component<?>> collection, com.google.firebase.components.ComponentRegistrarProcessor componentRegistrarProcessor) {
        this.components = new java.util.HashMap();
        this.lazyInstanceMap = new java.util.HashMap();
        this.lazySetMap = new java.util.HashMap();
        this.processedCoroutineDispatcherInterfaces = new java.util.HashSet();
        this.eagerComponentsInitializedWith = new java.util.concurrent.atomic.AtomicReference<>();
        com.google.firebase.components.EventBus eventBus = new com.google.firebase.components.EventBus(executor);
        this.eventBus = eventBus;
        this.componentRegistrarProcessor = componentRegistrarProcessor;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.google.firebase.components.Component.of(eventBus, (java.lang.Class<com.google.firebase.components.EventBus>) com.google.firebase.components.EventBus.class, (java.lang.Class<? super com.google.firebase.components.EventBus>[]) new java.lang.Class[]{com.google.firebase.events.Subscriber.class, com.google.firebase.events.Publisher.class}));
        arrayList.add(com.google.firebase.components.Component.of(this, (java.lang.Class<com.google.firebase.components.ComponentRuntime>) com.google.firebase.dynamicloading.ComponentLoader.class, (java.lang.Class<? super com.google.firebase.components.ComponentRuntime>[]) new java.lang.Class[0]));
        for (com.google.firebase.components.Component<?> component : collection) {
            if (component != null) {
                arrayList.add(component);
            }
        }
        this.unprocessedRegistrarProviders = iterableToList(iterable);
        discoverComponents(arrayList);
    }

    private void discoverComponents(java.util.List<com.google.firebase.components.Component<?>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this) {
            java.util.Iterator<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> it = this.unprocessedRegistrarProviders.iterator();
            while (it.hasNext()) {
                try {
                    com.google.firebase.components.ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.componentRegistrarProcessor.processRegistrar(componentRegistrar));
                        it.remove();
                    }
                } catch (com.google.firebase.components.InvalidRegistrarException e) {
                    it.remove();
                    android.util.Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            java.util.Iterator<com.google.firebase.components.Component<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                for (java.lang.Object obj : it2.next().getProvidedInterfaces().toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.processedCoroutineDispatcherInterfaces.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.processedCoroutineDispatcherInterfaces.add(obj.toString());
                    }
                }
            }
            if (this.components.isEmpty()) {
                com.google.firebase.components.CycleDetector.detect(list);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(this.components.keySet());
                arrayList2.addAll(list);
                com.google.firebase.components.CycleDetector.detect(arrayList2);
            }
            for (final com.google.firebase.components.Component<?> component : list) {
                this.components.put(component, new com.google.firebase.components.Lazy(new com.google.firebase.inject.Provider() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda1
                    @Override // com.google.firebase.inject.Provider
                    public final java.lang.Object get() {
                        return this.f$0.m817xc080f8d8(component);
                    }
                }));
            }
            arrayList.addAll(processInstanceComponents(list));
            arrayList.addAll(processSetComponents());
            processDependencies();
        }
        java.util.Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((java.lang.Runnable) it3.next()).run();
        }
        maybeInitializeEagerComponents();
    }

    /* JADX INFO: renamed from: lambda$discoverComponents$0$com-google-firebase-components-ComponentRuntime, reason: not valid java name */
    /* synthetic */ java.lang.Object m817xc080f8d8(com.google.firebase.components.Component component) {
        return component.getFactory().create(new com.google.firebase.components.RestrictedComponentContainer(component, this));
    }

    private void maybeInitializeEagerComponents() {
        java.lang.Boolean bool = this.eagerComponentsInitializedWith.get();
        if (bool != null) {
            doInitializeEagerComponents(this.components, bool.booleanValue());
        }
    }

    private static java.lang.Iterable<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> toProviders(java.lang.Iterable<com.google.firebase.components.ComponentRegistrar> iterable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final com.google.firebase.components.ComponentRegistrar componentRegistrar : iterable) {
            arrayList.add(new com.google.firebase.inject.Provider() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda3
                @Override // com.google.firebase.inject.Provider
                public final java.lang.Object get() {
                    return com.google.firebase.components.ComponentRuntime.lambda$toProviders$1(componentRegistrar);
                }
            });
        }
        return arrayList;
    }

    private static <T> java.util.List<T> iterableToList(java.lang.Iterable<T> iterable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private java.util.List<java.lang.Runnable> processInstanceComponents(java.util.List<com.google.firebase.components.Component<?>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.firebase.components.Component<?> component : list) {
            if (component.isValue()) {
                final com.google.firebase.inject.Provider<?> provider = this.components.get(component);
                for (com.google.firebase.components.Qualified<? super java.lang.Object> qualified : component.getProvidedInterfaces()) {
                    if (!this.lazyInstanceMap.containsKey(qualified)) {
                        this.lazyInstanceMap.put(qualified, provider);
                    } else {
                        final com.google.firebase.components.OptionalProvider optionalProvider = (com.google.firebase.components.OptionalProvider) this.lazyInstanceMap.get(qualified);
                        arrayList.add(new java.lang.Runnable() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                optionalProvider.set(provider);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    private java.util.List<java.lang.Runnable> processSetComponents() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap map = new java.util.HashMap();
        for (java.util.Map.Entry<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> entry : this.components.entrySet()) {
            com.google.firebase.components.Component<?> key = entry.getKey();
            if (!key.isValue()) {
                com.google.firebase.inject.Provider<?> value = entry.getValue();
                for (com.google.firebase.components.Qualified<? super java.lang.Object> qualified : key.getProvidedInterfaces()) {
                    if (!map.containsKey(qualified)) {
                        map.put(qualified, new java.util.HashSet());
                    }
                    ((java.util.Set) map.get(qualified)).add(value);
                }
            }
        }
        for (java.util.Map.Entry entry2 : map.entrySet()) {
            if (!this.lazySetMap.containsKey(entry2.getKey())) {
                this.lazySetMap.put((com.google.firebase.components.Qualified) entry2.getKey(), com.google.firebase.components.LazySet.fromCollection((java.util.Collection) entry2.getValue()));
            } else {
                final com.google.firebase.components.LazySet<?> lazySet = this.lazySetMap.get(entry2.getKey());
                for (final com.google.firebase.inject.Provider provider : (java.util.Set) entry2.getValue()) {
                    arrayList.add(new java.lang.Runnable() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            lazySet.add(provider);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> com.google.firebase.inject.Provider<T> getProvider(com.google.firebase.components.Qualified<T> qualified) {
        com.google.firebase.components.Preconditions.checkNotNull(qualified, "Null interface requested.");
        return (com.google.firebase.inject.Provider) this.lazyInstanceMap.get(qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Deferred<T> getDeferred(com.google.firebase.components.Qualified<T> qualified) {
        com.google.firebase.inject.Provider<T> provider = getProvider(qualified);
        if (provider == null) {
            return com.google.firebase.components.OptionalProvider.empty();
        }
        if (provider instanceof com.google.firebase.components.OptionalProvider) {
            return (com.google.firebase.components.OptionalProvider) provider;
        }
        return com.google.firebase.components.OptionalProvider.of(provider);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> com.google.firebase.inject.Provider<java.util.Set<T>> setOfProvider(com.google.firebase.components.Qualified<T> qualified) {
        com.google.firebase.components.LazySet<?> lazySet = this.lazySetMap.get(qualified);
        if (lazySet != null) {
            return lazySet;
        }
        return (com.google.firebase.inject.Provider<java.util.Set<T>>) EMPTY_PROVIDER;
    }

    public void initializeEagerComponents(boolean z) {
        java.util.HashMap map;
        if (kotlin.UByte$$ExternalSyntheticBackport0.m(this.eagerComponentsInitializedWith, null, java.lang.Boolean.valueOf(z))) {
            synchronized (this) {
                map = new java.util.HashMap(this.components);
            }
            doInitializeEagerComponents(map, z);
        }
    }

    private void doInitializeEagerComponents(java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> map, boolean z) {
        for (java.util.Map.Entry<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> entry : map.entrySet()) {
            com.google.firebase.components.Component<?> key = entry.getKey();
            com.google.firebase.inject.Provider<?> value = entry.getValue();
            if (key.isAlwaysEager() || (key.isEagerInDefaultApp() && z)) {
                value.get();
            }
        }
        this.eventBus.enablePublishingAndFlushPending();
    }

    @Override // com.google.firebase.dynamicloading.ComponentLoader
    public void discoverComponents() {
        synchronized (this) {
            if (this.unprocessedRegistrarProviders.isEmpty()) {
                return;
            }
            discoverComponents(new java.util.ArrayList());
        }
    }

    public void initializeAllComponentsForTests() {
        java.util.Iterator<com.google.firebase.inject.Provider<?>> it = this.components.values().iterator();
        while (it.hasNext()) {
            it.next().get();
        }
    }

    private void processDependencies() {
        for (com.google.firebase.components.Component<?> component : this.components.keySet()) {
            for (com.google.firebase.components.Dependency dependency : component.getDependencies()) {
                if (dependency.isSet() && !this.lazySetMap.containsKey(dependency.getInterface())) {
                    this.lazySetMap.put(dependency.getInterface(), com.google.firebase.components.LazySet.fromCollection(java.util.Collections.emptySet()));
                } else if (this.lazyInstanceMap.containsKey(dependency.getInterface())) {
                    continue;
                } else {
                    if (dependency.isRequired()) {
                        throw new com.google.firebase.components.MissingDependencyException(java.lang.String.format("Unsatisfied dependency for component %s: %s", component, dependency.getInterface()));
                    }
                    if (!dependency.isSet()) {
                        this.lazyInstanceMap.put(dependency.getInterface(), com.google.firebase.components.OptionalProvider.empty());
                    }
                }
            }
        }
    }

    java.util.Collection<com.google.firebase.components.Component<?>> getAllComponentsForTest() {
        return this.components.keySet();
    }

    public static final class Builder {
        private final java.util.concurrent.Executor defaultExecutor;
        private final java.util.List<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> lazyRegistrars = new java.util.ArrayList();
        private final java.util.List<com.google.firebase.components.Component<?>> additionalComponents = new java.util.ArrayList();
        private com.google.firebase.components.ComponentRegistrarProcessor componentRegistrarProcessor = com.google.firebase.components.ComponentRegistrarProcessor.NOOP;

        static /* synthetic */ com.google.firebase.components.ComponentRegistrar lambda$addComponentRegistrar$0(com.google.firebase.components.ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        Builder(java.util.concurrent.Executor executor) {
            this.defaultExecutor = executor;
        }

        public com.google.firebase.components.ComponentRuntime.Builder addLazyComponentRegistrars(java.util.Collection<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> collection) {
            this.lazyRegistrars.addAll(collection);
            return this;
        }

        public com.google.firebase.components.ComponentRuntime.Builder addComponentRegistrar(final com.google.firebase.components.ComponentRegistrar componentRegistrar) {
            this.lazyRegistrars.add(new com.google.firebase.inject.Provider() { // from class: com.google.firebase.components.ComponentRuntime$Builder$$ExternalSyntheticLambda0
                @Override // com.google.firebase.inject.Provider
                public final java.lang.Object get() {
                    return com.google.firebase.components.ComponentRuntime.Builder.lambda$addComponentRegistrar$0(componentRegistrar);
                }
            });
            return this;
        }

        public com.google.firebase.components.ComponentRuntime.Builder addComponent(com.google.firebase.components.Component<?> component) {
            this.additionalComponents.add(component);
            return this;
        }

        public com.google.firebase.components.ComponentRuntime.Builder setProcessor(com.google.firebase.components.ComponentRegistrarProcessor componentRegistrarProcessor) {
            this.componentRegistrarProcessor = componentRegistrarProcessor;
            return this;
        }

        public com.google.firebase.components.ComponentRuntime build() {
            return new com.google.firebase.components.ComponentRuntime(this.defaultExecutor, this.lazyRegistrars, this.additionalComponents, this.componentRegistrarProcessor);
        }
    }
}
