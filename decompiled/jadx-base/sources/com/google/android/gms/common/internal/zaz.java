package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zaz extends com.google.android.gms.dynamic.RemoteCreator {
    private static final com.google.android.gms.common.internal.zaz zaa = new com.google.android.gms.common.internal.zaz();

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static android.view.View zaa(android.content.Context context, int i, int i2) throws com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException {
        com.google.android.gms.common.internal.zaz zazVar = zaa;
        try {
            return (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(((com.google.android.gms.common.internal.zam) zazVar.getRemoteCreatorInstance(context)).zae(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), new com.google.android.gms.common.internal.zax(1, i, i2, null)));
        } catch (java.lang.Exception e) {
            throw new com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.zam ? (com.google.android.gms.common.internal.zam) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.zam(iBinder);
    }
}
