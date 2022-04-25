package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLBotCommandScopeChatAdmins}: botCommandScopeChatAdmins#b9aa606a</li>
 * <li>{@link TLBotCommandScopeChats}: botCommandScopeChats#6fe1a881</li>
 * <li>{@link TLBotCommandScopeDefault}: botCommandScopeDefault#2f6cb2ab</li>
 * <li>{@link TLBotCommandScopePeer}: botCommandScopePeer#db9d897d</li>
 * <li>{@link TLBotCommandScopePeerAdmins}: botCommandScopePeerAdmins#3fd863d1</li>
 * <li>{@link TLBotCommandScopePeerUser}: botCommandScopePeerUser#a1321f3</li>
 * <li>{@link TLBotCommandScopeUsers}: botCommandScopeUsers#3c4f04d8</li>
 * </ul>
 *
 */
public abstract class TLAbsBotCommandScope extends TLObject {
    public TLAbsBotCommandScope() {
    }
}
