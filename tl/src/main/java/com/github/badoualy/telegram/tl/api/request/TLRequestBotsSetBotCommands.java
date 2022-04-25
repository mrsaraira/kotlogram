package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsBotCommandScope;
import com.github.badoualy.telegram.tl.api.TLBotCommand;
import com.github.badoualy.telegram.tl.core.TLBool;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestBotsSetBotCommands extends TLMethod<TLBool> {
    public static final int CONSTRUCTOR_ID = 0x517165a;

    protected TLAbsBotCommandScope scope;

    protected String langCode;

    protected TLVector<TLBotCommand> commands;

    private final String _constructor = "bots.setBotCommands#517165a";

    public TLRequestBotsSetBotCommands() {
    }

    public TLRequestBotsSetBotCommands(TLAbsBotCommandScope scope, String langCode, TLVector<TLBotCommand> commands) {
        this.scope = scope;
        this.langCode = langCode;
        this.commands = commands;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLBool)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLBool) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(scope, stream);
        writeString(langCode, stream);
        writeTLVector(commands, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        scope = readTLObject(stream, context, TLAbsBotCommandScope.class, -1);
        langCode = readTLString(stream);
        commands = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += scope.computeSerializedSize();
        size += computeTLStringSerializedSize(langCode);
        size += commands.computeSerializedSize();
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

    public TLAbsBotCommandScope getScope() {
        return scope;
    }

    public void setScope(TLAbsBotCommandScope scope) {
        this.scope = scope;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public TLVector<TLBotCommand> getCommands() {
        return commands;
    }

    public void setCommands(TLVector<TLBotCommand> commands) {
        this.commands = commands;
    }
}
