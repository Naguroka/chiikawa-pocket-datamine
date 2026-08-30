package com.google.firebase.platforminfo;

/* JADX INFO: loaded from: classes5.dex */
public class LibraryVersionComponent {

    public interface VersionExtractor<T> {
        java.lang.String extract(T t);
    }

    private LibraryVersionComponent() {
    }

    public static com.google.firebase.components.Component<?> create(java.lang.String str, java.lang.String str2) {
        return com.google.firebase.components.Component.intoSet(com.google.firebase.platforminfo.LibraryVersion.create(str, str2), (java.lang.Class<com.google.firebase.platforminfo.LibraryVersion>) com.google.firebase.platforminfo.LibraryVersion.class);
    }

    public static com.google.firebase.components.Component<?> fromContext(final java.lang.String str, final com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor<android.content.Context> versionExtractor) {
        return com.google.firebase.components.Component.intoSetBuilder(com.google.firebase.platforminfo.LibraryVersion.class).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) android.content.Context.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.platforminfo.LibraryVersionComponent$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.platforminfo.LibraryVersion.create(str, versionExtractor.extract((android.content.Context) componentContainer.get(android.content.Context.class)));
            }
        }).build();
    }
}
