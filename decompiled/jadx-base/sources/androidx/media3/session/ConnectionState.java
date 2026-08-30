package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class ConnectionState {
    public final com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> customLayout;
    public final int libraryVersion;
    public final androidx.media3.common.Player.Commands playerCommandsFromPlayer;
    public final androidx.media3.common.Player.Commands playerCommandsFromSession;
    public final androidx.media3.session.PlayerInfo playerInfo;
    public final android.app.PendingIntent sessionActivity;
    public final androidx.media3.session.IMediaSession sessionBinder;
    public final androidx.media3.session.SessionCommands sessionCommands;
    public final android.os.Bundle sessionExtras;
    public final int sessionInterfaceVersion;
    public final android.os.Bundle tokenExtras;
    private static final java.lang.String FIELD_LIBRARY_VERSION = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_SESSION_BINDER = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_SESSION_ACTIVITY = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_CUSTOM_LAYOUT = androidx.media3.common.util.Util.intToStringMaxRadix(9);
    private static final java.lang.String FIELD_SESSION_COMMANDS = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_PLAYER_COMMANDS_FROM_SESSION = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_PLAYER_COMMANDS_FROM_PLAYER = androidx.media3.common.util.Util.intToStringMaxRadix(5);
    private static final java.lang.String FIELD_TOKEN_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(6);
    private static final java.lang.String FIELD_SESSION_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(11);
    private static final java.lang.String FIELD_PLAYER_INFO = androidx.media3.common.util.Util.intToStringMaxRadix(7);
    private static final java.lang.String FIELD_SESSION_INTERFACE_VERSION = androidx.media3.common.util.Util.intToStringMaxRadix(8);
    private static final java.lang.String FIELD_IN_PROCESS_BINDER = androidx.media3.common.util.Util.intToStringMaxRadix(10);

    public ConnectionState(int i, int i2, androidx.media3.session.IMediaSession iMediaSession, android.app.PendingIntent pendingIntent, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands, androidx.media3.common.Player.Commands commands2, android.os.Bundle bundle, android.os.Bundle bundle2, androidx.media3.session.PlayerInfo playerInfo) {
        this.libraryVersion = i;
        this.sessionInterfaceVersion = i2;
        this.sessionBinder = iMediaSession;
        this.sessionActivity = pendingIntent;
        this.customLayout = immutableList;
        this.sessionCommands = sessionCommands;
        this.playerCommandsFromSession = commands;
        this.playerCommandsFromPlayer = commands2;
        this.tokenExtras = bundle;
        this.sessionExtras = bundle2;
        this.playerInfo = playerInfo;
    }

    public android.os.Bundle toBundleForRemoteProcess(int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_LIBRARY_VERSION, this.libraryVersion);
        androidx.core.app.BundleCompat.putBinder(bundle, FIELD_SESSION_BINDER, this.sessionBinder.asBinder());
        bundle.putParcelable(FIELD_SESSION_ACTIVITY, this.sessionActivity);
        if (!this.customLayout.isEmpty()) {
            bundle.putParcelableArrayList(FIELD_CUSTOM_LAYOUT, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.customLayout, new androidx.media3.session.ConnectionState$$ExternalSyntheticLambda0()));
        }
        bundle.putBundle(FIELD_SESSION_COMMANDS, this.sessionCommands.toBundle());
        bundle.putBundle(FIELD_PLAYER_COMMANDS_FROM_SESSION, this.playerCommandsFromSession.toBundle());
        bundle.putBundle(FIELD_PLAYER_COMMANDS_FROM_PLAYER, this.playerCommandsFromPlayer.toBundle());
        bundle.putBundle(FIELD_TOKEN_EXTRAS, this.tokenExtras);
        bundle.putBundle(FIELD_SESSION_EXTRAS, this.sessionExtras);
        bundle.putBundle(FIELD_PLAYER_INFO, this.playerInfo.filterByAvailableCommands(androidx.media3.session.MediaUtils.intersect(this.playerCommandsFromSession, this.playerCommandsFromPlayer), false, false).toBundleForRemoteProcess(i));
        bundle.putInt(FIELD_SESSION_INTERFACE_VERSION, this.sessionInterfaceVersion);
        return bundle;
    }

    public android.os.Bundle toBundleInProcess() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBinder(FIELD_IN_PROCESS_BINDER, new androidx.media3.session.ConnectionState.InProcessBinder());
        return bundle;
    }

    public static androidx.media3.session.ConnectionState fromBundle(android.os.Bundle bundle) {
        com.google.common.collect.ImmutableList immutableListOf;
        androidx.media3.session.SessionCommands sessionCommandsFromBundle;
        androidx.media3.common.Player.Commands commandsFromBundle;
        androidx.media3.common.Player.Commands commandsFromBundle2;
        androidx.media3.session.PlayerInfo playerInfoFromBundle;
        android.os.IBinder binder = bundle.getBinder(FIELD_IN_PROCESS_BINDER);
        if (binder instanceof androidx.media3.session.ConnectionState.InProcessBinder) {
            return ((androidx.media3.session.ConnectionState.InProcessBinder) binder).getConnectionState();
        }
        int i = bundle.getInt(FIELD_LIBRARY_VERSION, 0);
        final int i2 = bundle.getInt(FIELD_SESSION_INTERFACE_VERSION, 0);
        android.os.IBinder iBinder = (android.os.IBinder) androidx.media3.common.util.Assertions.checkNotNull(androidx.core.app.BundleCompat.getBinder(bundle, FIELD_SESSION_BINDER));
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable(FIELD_SESSION_ACTIVITY);
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUSTOM_LAYOUT);
        if (parcelableArrayList != null) {
            immutableListOf = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.session.ConnectionState$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.media3.session.CommandButton.fromBundle((android.os.Bundle) obj, i2);
                }
            }, parcelableArrayList);
        } else {
            immutableListOf = com.google.common.collect.ImmutableList.of();
        }
        com.google.common.collect.ImmutableList immutableList = immutableListOf;
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_SESSION_COMMANDS);
        if (bundle2 == null) {
            sessionCommandsFromBundle = androidx.media3.session.SessionCommands.EMPTY;
        } else {
            sessionCommandsFromBundle = androidx.media3.session.SessionCommands.fromBundle(bundle2);
        }
        androidx.media3.session.SessionCommands sessionCommands = sessionCommandsFromBundle;
        android.os.Bundle bundle3 = bundle.getBundle(FIELD_PLAYER_COMMANDS_FROM_PLAYER);
        if (bundle3 == null) {
            commandsFromBundle = androidx.media3.common.Player.Commands.EMPTY;
        } else {
            commandsFromBundle = androidx.media3.common.Player.Commands.fromBundle(bundle3);
        }
        androidx.media3.common.Player.Commands commands = commandsFromBundle;
        android.os.Bundle bundle4 = bundle.getBundle(FIELD_PLAYER_COMMANDS_FROM_SESSION);
        if (bundle4 == null) {
            commandsFromBundle2 = androidx.media3.common.Player.Commands.EMPTY;
        } else {
            commandsFromBundle2 = androidx.media3.common.Player.Commands.fromBundle(bundle4);
        }
        androidx.media3.common.Player.Commands commands2 = commandsFromBundle2;
        android.os.Bundle bundle5 = bundle.getBundle(FIELD_TOKEN_EXTRAS);
        android.os.Bundle bundle6 = bundle.getBundle(FIELD_SESSION_EXTRAS);
        android.os.Bundle bundle7 = bundle.getBundle(FIELD_PLAYER_INFO);
        if (bundle7 == null) {
            playerInfoFromBundle = androidx.media3.session.PlayerInfo.DEFAULT;
        } else {
            playerInfoFromBundle = androidx.media3.session.PlayerInfo.fromBundle(bundle7, i2);
        }
        return new androidx.media3.session.ConnectionState(i, i2, androidx.media3.session.IMediaSession.Stub.asInterface(iBinder), pendingIntent, immutableList, sessionCommands, commands2, commands, bundle5 == null ? android.os.Bundle.EMPTY : bundle5, bundle6 == null ? android.os.Bundle.EMPTY : bundle6, playerInfoFromBundle);
    }

    private final class InProcessBinder extends android.os.Binder {
        private InProcessBinder() {
        }

        public androidx.media3.session.ConnectionState getConnectionState() {
            return androidx.media3.session.ConnectionState.this;
        }
    }
}
