package com.google.firebase.crashlytics.internal.breadcrumbs;

/* JADX INFO: loaded from: classes5.dex */
public class DisabledBreadcrumbSource implements com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource {
    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler breadcrumbHandler) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Could not register handler for breadcrumbs events.");
    }
}
