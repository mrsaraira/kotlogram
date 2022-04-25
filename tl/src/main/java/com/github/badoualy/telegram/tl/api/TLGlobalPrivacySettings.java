package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLGlobalPrivacySettings extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xbea2f424;

    protected int flags;

    protected boolean archiveAndMuteNewNoncontactPeers;

    private final String _constructor = "globalPrivacySettings#bea2f424";

    public TLGlobalPrivacySettings() {
    }

    public TLGlobalPrivacySettings(boolean archiveAndMuteNewNoncontactPeers) {
        this.archiveAndMuteNewNoncontactPeers = archiveAndMuteNewNoncontactPeers;
    }

    private void computeFlags() {
        flags = 0;
        flags = archiveAndMuteNewNoncontactPeers ? (flags | 1) : (flags & ~1);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        if ((flags & 1) != 0) {
            writeBoolean(archiveAndMuteNewNoncontactPeers, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        archiveAndMuteNewNoncontactPeers = (flags & 1) != 0 ? readTLBool(stream) : false;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        if ((flags & 1) != 0) {
            size += SIZE_BOOLEAN;
        }
        return size;
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }

    public boolean getArchiveAndMuteNewNoncontactPeers() {
        return archiveAndMuteNewNoncontactPeers;
    }

    public void setArchiveAndMuteNewNoncontactPeers(boolean archiveAndMuteNewNoncontactPeers) {
        this.archiveAndMuteNewNoncontactPeers = archiveAndMuteNewNoncontactPeers;
    }
}
