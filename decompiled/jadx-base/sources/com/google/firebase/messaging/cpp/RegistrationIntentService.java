package com.google.firebase.messaging.cpp;

/* JADX INFO: loaded from: classes5.dex */
public class RegistrationIntentService extends androidx.core.app.JobIntentService {
    private static final java.lang.String TAG = "FirebaseRegService";

    @Override // androidx.core.app.JobIntentService
    protected void onHandleWork(android.content.Intent intent) {
        com.google.firebase.messaging.FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener<java.lang.String>() { // from class: com.google.firebase.messaging.cpp.RegistrationIntentService.1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(com.google.android.gms.tasks.Task<java.lang.String> task) {
                if (!task.isSuccessful()) {
                    android.util.Log.w(com.google.firebase.messaging.cpp.RegistrationIntentService.TAG, "Fetching FCM registration token failed", task.getException());
                    return;
                }
                java.lang.String result = task.getResult();
                com.google.firebase.messaging.cpp.DebugLogging.log(com.google.firebase.messaging.cpp.RegistrationIntentService.TAG, java.lang.String.format("onHandleWork token=%s", result));
                if (result != null) {
                    com.google.firebase.messaging.cpp.RegistrationIntentService.writeTokenToInternalStorage(this, result);
                }
            }
        });
    }

    public static void writeTokenToInternalStorage(android.content.Context context, java.lang.String str) {
        byte[] bArrGenerateTokenByteBuffer = generateTokenByteBuffer(str);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(bArrGenerateTokenByteBuffer.length);
        try {
            java.io.FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("FIREBASE_CLOUD_MESSAGING_LOCKFILE", 0);
            try {
                java.nio.channels.FileLock fileLockLock = fileOutputStreamOpenFileOutput.getChannel().lock();
                try {
                    java.io.FileOutputStream fileOutputStreamOpenFileOutput2 = context.openFileOutput("FIREBASE_CLOUD_MESSAGING_LOCAL_STORAGE", 32768);
                    try {
                        fileOutputStreamOpenFileOutput2.write(byteBufferAllocate.array());
                        fileOutputStreamOpenFileOutput2.write(bArrGenerateTokenByteBuffer);
                        if (fileOutputStreamOpenFileOutput2 != null) {
                            fileOutputStreamOpenFileOutput2.close();
                        }
                        if (fileLockLock != null) {
                            fileLockLock.close();
                        }
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    } catch (java.lang.Throwable th) {
                        if (fileOutputStreamOpenFileOutput2 != null) {
                            try {
                                fileOutputStreamOpenFileOutput2.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.close();
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (java.lang.Throwable th5) {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private static byte[] generateTokenByteBuffer(java.lang.String str) {
        com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder = new com.google.flatbuffers.FlatBufferBuilder(0);
        if (str == null) {
            str = "";
        }
        int iCreateString = flatBufferBuilder.createString(str);
        com.google.firebase.messaging.cpp.SerializedTokenReceived.startSerializedTokenReceived(flatBufferBuilder);
        com.google.firebase.messaging.cpp.SerializedTokenReceived.addToken(flatBufferBuilder, iCreateString);
        int iEndSerializedTokenReceived = com.google.firebase.messaging.cpp.SerializedTokenReceived.endSerializedTokenReceived(flatBufferBuilder);
        com.google.firebase.messaging.cpp.SerializedEvent.startSerializedEvent(flatBufferBuilder);
        com.google.firebase.messaging.cpp.SerializedEvent.addEventType(flatBufferBuilder, (byte) 2);
        com.google.firebase.messaging.cpp.SerializedEvent.addEvent(flatBufferBuilder, iEndSerializedTokenReceived);
        flatBufferBuilder.finish(com.google.firebase.messaging.cpp.SerializedEvent.endSerializedEvent(flatBufferBuilder));
        return flatBufferBuilder.sizedByteArray();
    }
}
