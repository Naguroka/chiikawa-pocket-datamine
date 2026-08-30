package com.google.firebase.platforminfo;

/* JADX INFO: loaded from: classes5.dex */
public class DefaultUserAgentPublisher implements com.google.firebase.platforminfo.UserAgentPublisher {
    private final com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar gamesSDKRegistrar;
    private final java.lang.String javaSDKVersionUserAgent;

    DefaultUserAgentPublisher(java.util.Set<com.google.firebase.platforminfo.LibraryVersion> set, com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.javaSDKVersionUserAgent = toUserAgent(set);
        this.gamesSDKRegistrar = globalLibraryVersionRegistrar;
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public java.lang.String getUserAgent() {
        if (this.gamesSDKRegistrar.getRegisteredVersions().isEmpty()) {
            return this.javaSDKVersionUserAgent;
        }
        return this.javaSDKVersionUserAgent + ' ' + toUserAgent(this.gamesSDKRegistrar.getRegisteredVersions());
    }

    private static java.lang.String toUserAgent(java.util.Set<com.google.firebase.platforminfo.LibraryVersion> set) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<com.google.firebase.platforminfo.LibraryVersion> it = set.iterator();
        while (it.hasNext()) {
            com.google.firebase.platforminfo.LibraryVersion next = it.next();
            sb.append(next.getLibraryName()).append('/').append(next.getVersion());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static com.google.firebase.components.Component<com.google.firebase.platforminfo.UserAgentPublisher> component() {
        return com.google.firebase.components.Component.builder(com.google.firebase.platforminfo.UserAgentPublisher.class).add(com.google.firebase.components.Dependency.setOf((java.lang.Class<?>) com.google.firebase.platforminfo.LibraryVersion.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.platforminfo.DefaultUserAgentPublisher$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.platforminfo.DefaultUserAgentPublisher.lambda$component$0(componentContainer);
            }
        }).build();
    }

    static /* synthetic */ com.google.firebase.platforminfo.UserAgentPublisher lambda$component$0(com.google.firebase.components.ComponentContainer componentContainer) {
        return new com.google.firebase.platforminfo.DefaultUserAgentPublisher(componentContainer.setOf(com.google.firebase.platforminfo.LibraryVersion.class), com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar.getInstance());
    }
}
