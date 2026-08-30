package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final class SessionCommands {
    public static final androidx.media3.session.SessionCommands EMPTY = new androidx.media3.session.SessionCommands.Builder().build();
    private static final java.lang.String FIELD_SESSION_COMMANDS = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String TAG = "SessionCommands";
    public final com.google.common.collect.ImmutableSet<androidx.media3.session.SessionCommand> commands;

    public static final class Builder {
        private final java.util.Set<androidx.media3.session.SessionCommand> commands;

        public Builder() {
            this.commands = new java.util.HashSet();
        }

        private Builder(androidx.media3.session.SessionCommands sessionCommands) {
            this.commands = new java.util.HashSet(((androidx.media3.session.SessionCommands) androidx.media3.common.util.Assertions.checkNotNull(sessionCommands)).commands);
        }

        public androidx.media3.session.SessionCommands.Builder add(androidx.media3.session.SessionCommand sessionCommand) {
            this.commands.add((androidx.media3.session.SessionCommand) androidx.media3.common.util.Assertions.checkNotNull(sessionCommand));
            return this;
        }

        public androidx.media3.session.SessionCommands.Builder add(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i != 0);
            this.commands.add(new androidx.media3.session.SessionCommand(i));
            return this;
        }

        public androidx.media3.session.SessionCommands.Builder addSessionCommands(java.util.Collection<androidx.media3.session.SessionCommand> collection) {
            this.commands.addAll(collection);
            return this;
        }

        public androidx.media3.session.SessionCommands.Builder remove(androidx.media3.session.SessionCommand sessionCommand) {
            this.commands.remove(androidx.media3.common.util.Assertions.checkNotNull(sessionCommand));
            return this;
        }

        public androidx.media3.session.SessionCommands.Builder remove(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i != 0);
            for (androidx.media3.session.SessionCommand sessionCommand : this.commands) {
                if (sessionCommand.commandCode == i) {
                    this.commands.remove(sessionCommand);
                    break;
                }
            }
            return this;
        }

        androidx.media3.session.SessionCommands.Builder addAllSessionCommands() {
            addCommandCodes(androidx.media3.session.SessionCommand.SESSION_COMMANDS);
            return this;
        }

        androidx.media3.session.SessionCommands.Builder addAllLibraryCommands() {
            addCommandCodes(androidx.media3.session.SessionCommand.LIBRARY_COMMANDS);
            return this;
        }

        androidx.media3.session.SessionCommands.Builder addAllPredefinedCommands() {
            addAllSessionCommands();
            addAllLibraryCommands();
            return this;
        }

        private void addCommandCodes(java.util.List<java.lang.Integer> list) {
            for (int i = 0; i < list.size(); i++) {
                add(new androidx.media3.session.SessionCommand(list.get(i).intValue()));
            }
        }

        public androidx.media3.session.SessionCommands build() {
            return new androidx.media3.session.SessionCommands(this.commands);
        }
    }

    private SessionCommands(java.util.Collection<androidx.media3.session.SessionCommand> collection) {
        this.commands = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) collection);
    }

    public boolean contains(androidx.media3.session.SessionCommand sessionCommand) {
        return this.commands.contains(androidx.media3.common.util.Assertions.checkNotNull(sessionCommand));
    }

    public boolean contains(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i != 0, "Use contains(Command) for custom command");
        return containsCommandCode(this.commands, i);
    }

    public androidx.media3.session.SessionCommands.Builder buildUpon() {
        return new androidx.media3.session.SessionCommands.Builder();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.media3.session.SessionCommands) {
            return this.commands.equals(((androidx.media3.session.SessionCommands) obj).commands);
        }
        return false;
    }

    public int hashCode() {
        return androidx.core.util.ObjectsCompat.hash(this.commands);
    }

    private static boolean containsCommandCode(java.util.Collection<androidx.media3.session.SessionCommand> collection, int i) {
        java.util.Iterator<androidx.media3.session.SessionCommand> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().commandCode == i) {
                return true;
            }
        }
        return false;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        com.google.common.collect.UnmodifiableIterator<androidx.media3.session.SessionCommand> it = this.commands.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        bundle.putParcelableArrayList(FIELD_SESSION_COMMANDS, arrayList);
        return bundle;
    }

    public static androidx.media3.session.SessionCommands fromBundle(android.os.Bundle bundle) {
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_SESSION_COMMANDS);
        if (parcelableArrayList == null) {
            androidx.media3.common.util.Log.w(TAG, "Missing commands. Creating an empty SessionCommands");
            return EMPTY;
        }
        androidx.media3.session.SessionCommands.Builder builder = new androidx.media3.session.SessionCommands.Builder();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            builder.add(androidx.media3.session.SessionCommand.fromBundle((android.os.Bundle) parcelableArrayList.get(i)));
        }
        return builder.build();
    }
}
