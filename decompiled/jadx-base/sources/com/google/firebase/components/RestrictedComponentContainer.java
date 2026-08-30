package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
final class RestrictedComponentContainer implements com.google.firebase.components.ComponentContainer {
    private final java.util.Set<com.google.firebase.components.Qualified<?>> allowedDeferredInterfaces;
    private final java.util.Set<com.google.firebase.components.Qualified<?>> allowedDirectInterfaces;
    private final java.util.Set<com.google.firebase.components.Qualified<?>> allowedProviderInterfaces;
    private final java.util.Set<java.lang.Class<?>> allowedPublishedEvents;
    private final java.util.Set<com.google.firebase.components.Qualified<?>> allowedSetDirectInterfaces;
    private final java.util.Set<com.google.firebase.components.Qualified<?>> allowedSetProviderInterfaces;
    private final com.google.firebase.components.ComponentContainer delegateContainer;

    RestrictedComponentContainer(com.google.firebase.components.Component<?> component, com.google.firebase.components.ComponentContainer componentContainer) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashSet hashSet3 = new java.util.HashSet();
        java.util.HashSet hashSet4 = new java.util.HashSet();
        java.util.HashSet hashSet5 = new java.util.HashSet();
        for (com.google.firebase.components.Dependency dependency : component.getDependencies()) {
            if (dependency.isDirectInjection()) {
                if (dependency.isSet()) {
                    hashSet4.add(dependency.getInterface());
                } else {
                    hashSet.add(dependency.getInterface());
                }
            } else if (dependency.isDeferred()) {
                hashSet3.add(dependency.getInterface());
            } else if (dependency.isSet()) {
                hashSet5.add(dependency.getInterface());
            } else {
                hashSet2.add(dependency.getInterface());
            }
        }
        if (!component.getPublishedEvents().isEmpty()) {
            hashSet.add(com.google.firebase.components.Qualified.unqualified(com.google.firebase.events.Publisher.class));
        }
        this.allowedDirectInterfaces = java.util.Collections.unmodifiableSet(hashSet);
        this.allowedProviderInterfaces = java.util.Collections.unmodifiableSet(hashSet2);
        this.allowedDeferredInterfaces = java.util.Collections.unmodifiableSet(hashSet3);
        this.allowedSetDirectInterfaces = java.util.Collections.unmodifiableSet(hashSet4);
        this.allowedSetProviderInterfaces = java.util.Collections.unmodifiableSet(hashSet5);
        this.allowedPublishedEvents = component.getPublishedEvents();
        this.delegateContainer = componentContainer;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(java.lang.Class<T> cls) {
        if (!this.allowedDirectInterfaces.contains(com.google.firebase.components.Qualified.unqualified(cls))) {
            throw new com.google.firebase.components.DependencyException(java.lang.String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.delegateContainer.get(cls);
        return !cls.equals(com.google.firebase.events.Publisher.class) ? t : (T) new com.google.firebase.components.RestrictedComponentContainer.RestrictedPublisher(this.allowedPublishedEvents, (com.google.firebase.events.Publisher) t);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(com.google.firebase.components.Qualified<T> qualified) {
        if (!this.allowedDirectInterfaces.contains(qualified)) {
            throw new com.google.firebase.components.DependencyException(java.lang.String.format("Attempting to request an undeclared dependency %s.", qualified));
        }
        return (T) this.delegateContainer.get(qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Provider<T> getProvider(java.lang.Class<T> cls) {
        return getProvider(com.google.firebase.components.Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Deferred<T> getDeferred(java.lang.Class<T> cls) {
        return getDeferred(com.google.firebase.components.Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Provider<java.util.Set<T>> setOfProvider(java.lang.Class<T> cls) {
        return setOfProvider(com.google.firebase.components.Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Provider<T> getProvider(com.google.firebase.components.Qualified<T> qualified) {
        if (!this.allowedProviderInterfaces.contains(qualified)) {
            throw new com.google.firebase.components.DependencyException(java.lang.String.format("Attempting to request an undeclared dependency Provider<%s>.", qualified));
        }
        return this.delegateContainer.getProvider(qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Deferred<T> getDeferred(com.google.firebase.components.Qualified<T> qualified) {
        if (!this.allowedDeferredInterfaces.contains(qualified)) {
            throw new com.google.firebase.components.DependencyException(java.lang.String.format("Attempting to request an undeclared dependency Deferred<%s>.", qualified));
        }
        return this.delegateContainer.getDeferred(qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Provider<java.util.Set<T>> setOfProvider(com.google.firebase.components.Qualified<T> qualified) {
        if (!this.allowedSetProviderInterfaces.contains(qualified)) {
            throw new com.google.firebase.components.DependencyException(java.lang.String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", qualified));
        }
        return this.delegateContainer.setOfProvider(qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> java.util.Set<T> setOf(com.google.firebase.components.Qualified<T> qualified) {
        if (!this.allowedSetDirectInterfaces.contains(qualified)) {
            throw new com.google.firebase.components.DependencyException(java.lang.String.format("Attempting to request an undeclared dependency Set<%s>.", qualified));
        }
        return this.delegateContainer.setOf(qualified);
    }

    private static class RestrictedPublisher implements com.google.firebase.events.Publisher {
        private final java.util.Set<java.lang.Class<?>> allowedPublishedEvents;
        private final com.google.firebase.events.Publisher delegate;

        public RestrictedPublisher(java.util.Set<java.lang.Class<?>> set, com.google.firebase.events.Publisher publisher) {
            this.allowedPublishedEvents = set;
            this.delegate = publisher;
        }

        @Override // com.google.firebase.events.Publisher
        public void publish(com.google.firebase.events.Event<?> event) {
            if (!this.allowedPublishedEvents.contains(event.getType())) {
                throw new com.google.firebase.components.DependencyException(java.lang.String.format("Attempting to publish an undeclared event %s.", event));
            }
            this.delegate.publish(event);
        }
    }
}
