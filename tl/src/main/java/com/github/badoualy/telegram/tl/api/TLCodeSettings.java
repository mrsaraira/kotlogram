package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLBytes;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLCodeSettings extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x8a6469c2;

    protected int flags;

    protected boolean allowFlashcall;

    protected boolean currentNumber;

    protected boolean allowAppHash;

    protected boolean allowMissedCall;

    protected TLVector<TLBytes> logoutTokens;

    private final String _constructor = "codeSettings#8a6469c2";

    public TLCodeSettings() {
    }

    public TLCodeSettings(boolean allowFlashcall, boolean currentNumber, boolean allowAppHash, boolean allowMissedCall, TLVector<TLBytes> logoutTokens) {
        this.allowFlashcall = allowFlashcall;
        this.currentNumber = currentNumber;
        this.allowAppHash = allowAppHash;
        this.allowMissedCall = allowMissedCall;
        this.logoutTokens = logoutTokens;
    }

    private void computeFlags() {
        flags = 0;
        flags = allowFlashcall ? (flags | 1) : (flags & ~1);
        flags = currentNumber ? (flags | 2) : (flags & ~2);
        flags = allowAppHash ? (flags | 16) : (flags & ~16);
        flags = allowMissedCall ? (flags | 32) : (flags & ~32);
        flags = logoutTokens != null ? (flags | 64) : (flags & ~64);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        if ((flags & 64) != 0) {
            if (logoutTokens == null) throwNullFieldException("logoutTokens", flags);
            writeTLVector(logoutTokens, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        allowFlashcall = (flags & 1) != 0;
        currentNumber = (flags & 2) != 0;
        allowAppHash = (flags & 16) != 0;
        allowMissedCall = (flags & 32) != 0;
        logoutTokens = (flags & 64) != 0 ? readTLVector(stream, context) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        if ((flags & 64) != 0) {
            if (logoutTokens == null) throwNullFieldException("logoutTokens", flags);
            size += logoutTokens.computeSerializedSize();
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

    public boolean getAllowFlashcall() {
        return allowFlashcall;
    }

    public void setAllowFlashcall(boolean allowFlashcall) {
        this.allowFlashcall = allowFlashcall;
    }

    public boolean getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(boolean currentNumber) {
        this.currentNumber = currentNumber;
    }

    public boolean getAllowAppHash() {
        return allowAppHash;
    }

    public void setAllowAppHash(boolean allowAppHash) {
        this.allowAppHash = allowAppHash;
    }

    public boolean getAllowMissedCall() {
        return allowMissedCall;
    }

    public void setAllowMissedCall(boolean allowMissedCall) {
        this.allowMissedCall = allowMissedCall;
    }

    public TLVector<TLBytes> getLogoutTokens() {
        return logoutTokens;
    }

    public void setLogoutTokens(TLVector<TLBytes> logoutTokens) {
        this.logoutTokens = logoutTokens;
    }
}
