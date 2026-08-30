package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzal extends com.google.android.gms.internal.games_v2.zzb implements com.google.android.gms.games.internal.zzam {
    public zzal() {
        super("com.google.android.gms.games.internal.IGamesCallbacks");
    }

    @Override // com.google.android.gms.internal.games_v2.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 6001 || i == 6002) {
            parcel.readString();
            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
        } else if (i == 12011) {
            com.google.android.gms.common.data.DataHolder dataHolder = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
            zzd(dataHolder);
        } else if (i == 12012) {
            int i3 = parcel.readInt();
            java.lang.String string = parcel.readString();
            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
            zzp(i3, string);
        } else if (i == 13001) {
            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
        } else if (i == 13002) {
            parcel.readInt();
            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
        } else if (i == 19001) {
            parcel.readInt();
            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
        } else if (i != 19002) {
            switch (i) {
                case 5001:
                    parcel.readInt();
                    parcel.readString();
                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                    break;
                case 5002:
                    com.google.android.gms.common.data.DataHolder dataHolder2 = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                    zzc(dataHolder2);
                    break;
                case 5003:
                    int i4 = parcel.readInt();
                    java.lang.String string2 = parcel.readString();
                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                    zzb(i4, string2);
                    break;
                case 5004:
                    com.google.android.gms.common.data.DataHolder dataHolder3 = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                    zzg(dataHolder3);
                    break;
                case com.json.mediationsdk.utils.IronSourceConstants.errorCode_loadException /* 5005 */:
                    com.google.android.gms.common.data.DataHolder dataHolder4 = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                    com.google.android.gms.common.data.DataHolder dataHolder5 = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                    zzf(dataHolder4, dataHolder5);
                    break;
                case com.json.mediationsdk.utils.IronSourceConstants.errorCode_showFailed /* 5006 */:
                    com.google.android.gms.common.data.DataHolder dataHolder6 = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                    zzk(dataHolder6);
                    break;
                case com.json.mediationsdk.utils.IronSourceConstants.errorCode_initSuccess /* 5007 */:
                    com.google.android.gms.common.data.DataHolder dataHolder7 = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                    zzj(dataHolder7);
                    break;
                case com.json.mediationsdk.utils.IronSourceConstants.errorCode_initFailed /* 5008 */:
                    com.google.android.gms.common.data.DataHolder dataHolder8 = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                    zze(dataHolder8);
                    break;
                case com.json.mediationsdk.utils.IronSourceConstants.errorCode_adClosed /* 5009 */:
                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                    break;
                case com.json.mediationsdk.utils.IronSourceConstants.errorCode_destroy /* 5010 */:
                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                    break;
                case com.json.mediationsdk.utils.IronSourceConstants.errorCode_internal /* 5011 */:
                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                    break;
                default:
                    switch (i) {
                        case 5016:
                            zzm();
                            break;
                        case 5017:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5018:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5019:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5020:
                            parcel.readInt();
                            parcel.readString();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5021:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5022:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5023:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5024:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5025:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5026:
                            parcel.createStringArray();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5027:
                            parcel.createStringArray();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5028:
                            parcel.createStringArray();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5029:
                            parcel.createStringArray();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5030:
                            parcel.createStringArray();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5031:
                            parcel.createStringArray();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5032:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5033:
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readString();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5034:
                            parcel.readInt();
                            parcel.readString();
                            com.google.android.gms.internal.games_v2.zzc.zzg(parcel);
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5035:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5036:
                            parcel.readInt();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5037:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5038:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5039:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 5040:
                            parcel.readInt();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 9001:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 11001:
                            parcel.readInt();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 12001:
                            com.google.android.gms.common.data.DataHolder dataHolder9 = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            zzr(dataHolder9);
                            break;
                        case 14001:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 15001:
                            com.google.android.gms.common.data.DataHolder dataHolder10 = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            zzi(dataHolder10);
                            break;
                        case com.google.firebase.FirebaseError.ERROR_CUSTOM_TOKEN_MISMATCH /* 17002 */:
                            parcel.readInt();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 19008:
                            parcel.readInt();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 19009:
                            parcel.readInt();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 19010:
                            parcel.readInt();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 20001:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 20002:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 20003:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 20004:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 20005:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 20006:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 20007:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 20008:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 20009:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 20012:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 20019:
                            parcel.readInt();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 20020:
                            parcel.readInt();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 23001:
                            parcel.readInt();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 23002:
                            parcel.readInt();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 23003:
                            parcel.readInt();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 23004:
                            parcel.readInt();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 23005:
                            parcel.readInt();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 24002:
                            com.google.android.gms.internal.games_v2.zzc.zzg(parcel);
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 25002:
                            parcel.readString();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        case 25003:
                            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                            java.lang.String string3 = parcel.readString();
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            zzl(status, string3);
                            break;
                        case 25004:
                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                            break;
                        default:
                            switch (i) {
                                case com.google.android.gms.nearby.connection.ConnectionsStatusCodes.STATUS_ALREADY_ADVERTISING /* 8001 */:
                                    com.google.android.gms.common.data.DataHolder dataHolder11 = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                    zzh(dataHolder11);
                                    break;
                                case com.google.android.gms.nearby.connection.ConnectionsStatusCodes.STATUS_ALREADY_DISCOVERING /* 8002 */:
                                    parcel.readInt();
                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                    break;
                                case com.google.android.gms.nearby.connection.ConnectionsStatusCodes.STATUS_ALREADY_CONNECTED_TO_ENDPOINT /* 8003 */:
                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                    break;
                                case com.google.android.gms.nearby.connection.ConnectionsStatusCodes.STATUS_CONNECTION_REJECTED /* 8004 */:
                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                    break;
                                case com.google.android.gms.nearby.connection.ConnectionsStatusCodes.STATUS_NOT_CONNECTED_TO_ENDPOINT /* 8005 */:
                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                    break;
                                case 8006:
                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                    break;
                                case 8007:
                                    parcel.readInt();
                                    parcel.readString();
                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                    break;
                                case com.google.android.gms.nearby.connection.ConnectionsStatusCodes.STATUS_ALREADY_HAVE_ACTIVE_STRATEGY /* 8008 */:
                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                    break;
                                case com.google.android.gms.nearby.connection.ConnectionsStatusCodes.STATUS_OUT_OF_ORDER_API_CALL /* 8009 */:
                                    parcel.readString();
                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                    break;
                                case 8010:
                                    parcel.readString();
                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                    break;
                                default:
                                    switch (i) {
                                        case com.google.android.gms.games.GamesActivityResultCodes.RESULT_RECONNECT_REQUIRED /* 10001 */:
                                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                            break;
                                        case com.google.android.gms.games.GamesActivityResultCodes.RESULT_SIGN_IN_FAILED /* 10002 */:
                                            parcel.readString();
                                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                            break;
                                        case com.google.android.gms.games.GamesActivityResultCodes.RESULT_LICENSE_FAILED /* 10003 */:
                                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                            break;
                                        case com.google.android.gms.games.GamesActivityResultCodes.RESULT_APP_MISCONFIGURED /* 10004 */:
                                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                            break;
                                        case 10005:
                                            parcel.readInt();
                                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                            break;
                                        case com.google.android.gms.games.GamesActivityResultCodes.RESULT_NETWORK_FAILURE /* 10006 */:
                                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                            break;
                                        default:
                                            switch (i) {
                                                case 12004:
                                                    com.google.android.gms.common.data.DataHolder dataHolder12 = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                                                    com.google.android.gms.drive.Contents contents = (com.google.android.gms.drive.Contents) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.drive.Contents.CREATOR);
                                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                                    zzq(dataHolder12, contents);
                                                    break;
                                                case 12005:
                                                    com.google.android.gms.common.data.DataHolder dataHolder13 = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                                    zzn(dataHolder13);
                                                    break;
                                                case 12006:
                                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                                    break;
                                                case 12007:
                                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                                    break;
                                                case 12008:
                                                    com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 12014:
                                                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                                            break;
                                                        case 12015:
                                                            parcel.readInt();
                                                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                                            break;
                                                        case 12016:
                                                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                                            break;
                                                        case 12017:
                                                            com.google.android.gms.common.data.DataHolder dataHolder14 = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                                                            java.lang.String string4 = parcel.readString();
                                                            com.google.android.gms.drive.Contents contents2 = (com.google.android.gms.drive.Contents) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.drive.Contents.CREATOR);
                                                            com.google.android.gms.drive.Contents contents3 = (com.google.android.gms.drive.Contents) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.drive.Contents.CREATOR);
                                                            com.google.android.gms.drive.Contents contents4 = (com.google.android.gms.drive.Contents) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.drive.Contents.CREATOR);
                                                            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
                                                            zzo(dataHolder14, string4, contents2, contents3, contents4);
                                                            break;
                                                        default:
                                                            return false;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            parcel.readInt();
            com.google.android.gms.internal.games_v2.zzc.zzg(parcel);
            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
