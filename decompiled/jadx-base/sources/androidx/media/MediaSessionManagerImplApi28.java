package androidx.media;

/* JADX INFO: loaded from: classes.dex */
class MediaSessionManagerImplApi28 extends androidx.media.MediaSessionManagerImplApi21 {
    android.media.session.MediaSessionManager mObject;

    MediaSessionManagerImplApi28(android.content.Context context) {
        super(context);
        this.mObject = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.MediaSessionManagerImplApi21, androidx.media.MediaSessionManagerImplBase, androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(androidx.media.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        return super.isTrustedForMediaControl(remoteUserInfoImpl);
    }

    static final class RemoteUserInfoImplApi28 extends androidx.media.MediaSessionManagerImplBase.RemoteUserInfoImplBase {
        final android.media.session.MediaSessionManager.RemoteUserInfo mObject;

        RemoteUserInfoImplApi28(java.lang.String str, int i, int i2) {
            super(str, i, i2);
            this.mObject = new android.media.session.MediaSessionManager.RemoteUserInfo(str, i, i2);
        }

        RemoteUserInfoImplApi28(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
            this.mObject = remoteUserInfo;
        }

        static java.lang.String getPackageName(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            return remoteUserInfo.getPackageName();
        }
    }
}
