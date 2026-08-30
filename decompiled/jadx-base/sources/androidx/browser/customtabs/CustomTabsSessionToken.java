package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public class CustomTabsSessionToken {
    private static final java.lang.String TAG = "CustomTabsSessionToken";
    private final androidx.browser.customtabs.CustomTabsCallback mCallback;
    final android.support.customtabs.ICustomTabsCallback mCallbackBinder;
    private final android.app.PendingIntent mSessionId;

    static class MockCallback extends android.support.customtabs.ICustomTabsCallback.Stub {
        @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(java.lang.String str, android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public android.os.Bundle extraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityLayout(int i, int i2, int i3, int i4, int i5, android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityResized(int i, int i2, android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMinimized(android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i, android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(java.lang.String str, android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i, android.net.Uri uri, boolean z, android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onUnminimized(android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onWarmupCompleted(android.os.Bundle bundle) {
        }

        MockCallback() {
        }
    }

    public static androidx.browser.customtabs.CustomTabsSessionToken getSessionTokenFromIntent(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        android.os.IBinder binder = extras.getBinder(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION);
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) intent.getParcelableExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
        if (binder == null && pendingIntent == null) {
            return null;
        }
        return new androidx.browser.customtabs.CustomTabsSessionToken(binder != null ? android.support.customtabs.ICustomTabsCallback.Stub.asInterface(binder) : null, pendingIntent);
    }

    public static androidx.browser.customtabs.CustomTabsSessionToken createMockSessionTokenForTesting() {
        return new androidx.browser.customtabs.CustomTabsSessionToken(new androidx.browser.customtabs.CustomTabsSessionToken.MockCallback(), null);
    }

    CustomTabsSessionToken(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.app.PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            throw new java.lang.IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.mCallbackBinder = iCustomTabsCallback;
        this.mSessionId = pendingIntent;
        this.mCallback = iCustomTabsCallback == null ? null : new androidx.browser.customtabs.CustomTabsCallback() { // from class: androidx.browser.customtabs.CustomTabsSessionToken.1
            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onNavigationEvent(int i, android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.mCallbackBinder.onNavigationEvent(i, bundle);
                } catch (android.os.RemoteException unused) {
                    android.util.Log.e(androidx.browser.customtabs.CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void extraCallback(java.lang.String str, android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.mCallbackBinder.extraCallback(str, bundle);
                } catch (android.os.RemoteException unused) {
                    android.util.Log.e(androidx.browser.customtabs.CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public android.os.Bundle extraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) {
                try {
                    return androidx.browser.customtabs.CustomTabsSessionToken.this.mCallbackBinder.extraCallbackWithResult(str, bundle);
                } catch (android.os.RemoteException unused) {
                    android.util.Log.e(androidx.browser.customtabs.CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    return null;
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onMessageChannelReady(android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.mCallbackBinder.onMessageChannelReady(bundle);
                } catch (android.os.RemoteException unused) {
                    android.util.Log.e(androidx.browser.customtabs.CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onPostMessage(java.lang.String str, android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.mCallbackBinder.onPostMessage(str, bundle);
                } catch (android.os.RemoteException unused) {
                    android.util.Log.e(androidx.browser.customtabs.CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onRelationshipValidationResult(int i, android.net.Uri uri, boolean z, android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.mCallbackBinder.onRelationshipValidationResult(i, uri, z, bundle);
                } catch (android.os.RemoteException unused) {
                    android.util.Log.e(androidx.browser.customtabs.CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onActivityResized(int i, int i2, android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.mCallbackBinder.onActivityResized(i, i2, bundle);
                } catch (android.os.RemoteException unused) {
                    android.util.Log.e(androidx.browser.customtabs.CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onWarmupCompleted(android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.mCallbackBinder.onWarmupCompleted(bundle);
                } catch (android.os.RemoteException unused) {
                    android.util.Log.e(androidx.browser.customtabs.CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onActivityLayout(int i, int i2, int i3, int i4, int i5, android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.mCallbackBinder.onActivityLayout(i, i2, i3, i4, i5, bundle);
                } catch (android.os.RemoteException unused) {
                    android.util.Log.e(androidx.browser.customtabs.CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onMinimized(android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.mCallbackBinder.onMinimized(bundle);
                } catch (android.os.RemoteException unused) {
                    android.util.Log.e(androidx.browser.customtabs.CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onUnminimized(android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.mCallbackBinder.onUnminimized(bundle);
                } catch (android.os.RemoteException unused) {
                    android.util.Log.e(androidx.browser.customtabs.CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                }
            }
        };
    }

    android.os.IBinder getCallbackBinder() {
        android.support.customtabs.ICustomTabsCallback iCustomTabsCallback = this.mCallbackBinder;
        if (iCustomTabsCallback == null) {
            return null;
        }
        return iCustomTabsCallback.asBinder();
    }

    private android.os.IBinder getCallbackBinderAssertNotNull() {
        android.support.customtabs.ICustomTabsCallback iCustomTabsCallback = this.mCallbackBinder;
        if (iCustomTabsCallback == null) {
            throw new java.lang.IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
        }
        return iCustomTabsCallback.asBinder();
    }

    android.app.PendingIntent getId() {
        return this.mSessionId;
    }

    public boolean hasCallback() {
        return this.mCallbackBinder != null;
    }

    public boolean hasId() {
        return this.mSessionId != null;
    }

    public int hashCode() {
        android.app.PendingIntent pendingIntent = this.mSessionId;
        return pendingIntent != null ? pendingIntent.hashCode() : getCallbackBinderAssertNotNull().hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.browser.customtabs.CustomTabsSessionToken)) {
            return false;
        }
        androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken = (androidx.browser.customtabs.CustomTabsSessionToken) obj;
        android.app.PendingIntent id = customTabsSessionToken.getId();
        android.app.PendingIntent pendingIntent = this.mSessionId;
        if ((pendingIntent == null) != (id == null)) {
            return false;
        }
        if (pendingIntent != null) {
            return pendingIntent.equals(id);
        }
        return getCallbackBinderAssertNotNull().equals(customTabsSessionToken.getCallbackBinderAssertNotNull());
    }

    public androidx.browser.customtabs.CustomTabsCallback getCallback() {
        return this.mCallback;
    }

    public boolean isAssociatedWith(androidx.browser.customtabs.CustomTabsSession customTabsSession) {
        return customTabsSession.getBinder().equals(this.mCallbackBinder);
    }
}
