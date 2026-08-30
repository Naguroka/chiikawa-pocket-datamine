package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes6.dex */
public interface ProfileStoreBoundaryInterface {
    boolean deleteProfile(java.lang.String str);

    java.util.List<java.lang.String> getAllProfileNames();

    java.lang.reflect.InvocationHandler getOrCreateProfile(java.lang.String str);

    java.lang.reflect.InvocationHandler getProfile(java.lang.String str);
}
