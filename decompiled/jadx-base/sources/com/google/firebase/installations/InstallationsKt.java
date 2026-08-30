package com.google.firebase.installations;

/* JADX INFO: compiled from: Installations.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"installations", "Lcom/google/firebase/installations/FirebaseInstallations;", "Lcom/google/firebase/Firebase;", "getInstallations", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/installations/FirebaseInstallations;", "app", "Lcom/google/firebase/FirebaseApp;", "com.google.firebase-firebase-installations"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InstallationsKt {
    public static final com.google.firebase.installations.FirebaseInstallations getInstallations(com.google.firebase.Firebase firebase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "<this>");
        com.google.firebase.installations.FirebaseInstallations firebaseInstallations = com.google.firebase.installations.FirebaseInstallations.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseInstallations, "getInstance()");
        return firebaseInstallations;
    }

    public static final com.google.firebase.installations.FirebaseInstallations installations(com.google.firebase.Firebase firebase, com.google.firebase.FirebaseApp app) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(app, "app");
        com.google.firebase.installations.FirebaseInstallations firebaseInstallations = com.google.firebase.installations.FirebaseInstallations.getInstance(app);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseInstallations, "getInstance(app)");
        return firebaseInstallations;
    }
}
