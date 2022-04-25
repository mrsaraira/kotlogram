package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputMessageEntityMentionName}: inputMessageEntityMentionName#208e68c9</li>
 * <li>{@link TLMessageEntityBankCard}: messageEntityBankCard#761e6af4</li>
 * <li>{@link TLMessageEntityBlockquote}: messageEntityBlockquote#20df5d0</li>
 * <li>{@link TLMessageEntityBold}: messageEntityBold#bd610bc9</li>
 * <li>{@link TLMessageEntityBotCommand}: messageEntityBotCommand#6cef8ac7</li>
 * <li>{@link TLMessageEntityCashtag}: messageEntityCashtag#4c4e743f</li>
 * <li>{@link TLMessageEntityCode}: messageEntityCode#28a20571</li>
 * <li>{@link TLMessageEntityEmail}: messageEntityEmail#64e475c2</li>
 * <li>{@link TLMessageEntityHashtag}: messageEntityHashtag#6f635b0d</li>
 * <li>{@link TLMessageEntityItalic}: messageEntityItalic#826f8b60</li>
 * <li>{@link TLMessageEntityMention}: messageEntityMention#fa04579d</li>
 * <li>{@link TLMessageEntityMentionName}: messageEntityMentionName#dc7b1140</li>
 * <li>{@link TLMessageEntityPhone}: messageEntityPhone#9b69e34b</li>
 * <li>{@link TLMessageEntityPre}: messageEntityPre#73924be0</li>
 * <li>{@link TLMessageEntitySpoiler}: messageEntitySpoiler#32ca960f</li>
 * <li>{@link TLMessageEntityStrike}: messageEntityStrike#bf0693d4</li>
 * <li>{@link TLMessageEntityTextUrl}: messageEntityTextUrl#76a6d327</li>
 * <li>{@link TLMessageEntityUnderline}: messageEntityUnderline#9c4e7e8b</li>
 * <li>{@link TLMessageEntityUnknown}: messageEntityUnknown#bb92ba95</li>
 * <li>{@link TLMessageEntityUrl}: messageEntityUrl#6ed02538</li>
 * </ul>
 *
 */
public abstract class TLAbsMessageEntity extends TLObject {
    protected int offset;

    protected int length;

    public TLAbsMessageEntity() {
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
