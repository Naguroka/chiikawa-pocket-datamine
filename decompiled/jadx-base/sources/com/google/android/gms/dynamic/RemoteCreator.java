package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class RemoteCreator<T> {
    private final java.lang.String zza;
    private java.lang.Object zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public static class RemoteCreatorException extends java.lang.Exception {
        public RemoteCreatorException(java.lang.String str) {
            super(str);
        }

        public RemoteCreatorException(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }
    }

    protected RemoteCreator(java.lang.String str) {
        this.zza = str;
    }

    protected abstract T getRemoteCreator(android.os.IBinder iBinder);

    protected final T getRemoteCreatorInstance(android.content.Context context) throws com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException {
        if (this.zzb == null) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
            android.content.Context remoteContext = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                throw new com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((android.os.IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
            } catch (java.lang.ClassNotFoundException e) {
                throw new com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException("Could not load creator class.", e);
            } catch (java.lang.IllegalAccessException e2) {
                throw new com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException("Could not access creator.", e2);
            } catch (java.lang.InstantiationException e3) {
                throw new com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException("Could not instantiate creator.", e3);
            }
        }
        return (T) this.zzb;
    }
}
