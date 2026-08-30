package com.google.android.gms.common.moduleinstall.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.moduleinstall.internal.zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zac.zaa(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse moduleAvailabilityResponse = (com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse) com.google.android.gms.internal.base.zac.zaa(parcel, com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse.CREATOR);
            com.google.android.gms.internal.base.zac.zab(parcel);
            zae(status, moduleAvailabilityResponse);
        } else if (i == 2) {
            com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zac.zaa(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.common.moduleinstall.ModuleInstallResponse moduleInstallResponse = (com.google.android.gms.common.moduleinstall.ModuleInstallResponse) com.google.android.gms.internal.base.zac.zaa(parcel, com.google.android.gms.common.moduleinstall.ModuleInstallResponse.CREATOR);
            com.google.android.gms.internal.base.zac.zab(parcel);
            zad(status2, moduleInstallResponse);
        } else if (i == 3) {
            com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zac.zaa(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse moduleInstallIntentResponse = (com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse) com.google.android.gms.internal.base.zac.zaa(parcel, com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse.CREATOR);
            com.google.android.gms.internal.base.zac.zab(parcel);
            zac(status3, moduleInstallIntentResponse);
        } else {
            if (i != 4) {
                return false;
            }
            com.google.android.gms.common.api.Status status4 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zac.zaa(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.internal.base.zac.zab(parcel);
            zab(status4);
        }
        return true;
    }
}
