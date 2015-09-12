/*-
 * Copyright (C) 2008 Erik Larsson
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * This code was written from studying vfdecrypt, Copyright (c) 2006
 *   Ralf-Philipp Weinmann <ralf@coderpunks.org>
 *   Jacob Appelbaum <jacob@appelbaum.net>
 *   Christian Fromme <kaner@strace.org>
 *
 * [I'm not sure if their copyright and license terms need to be applied,
 *  but in case they do, the original license terms are reprinted below
 *  as required by the license.]
 *
 * The vfdecrypt license says:
 *   Permission is hereby granted, free of charge, to any person
 *   obtaining a copy of this software and associated documentation
 *   files (the "Software"), to deal in the Software without
 *   restriction, including without limitation the rights to use,
 *   copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the
 *   Software is furnished to do so, subject to the following
 *   conditions:
 *
 *   The above copyright notice and this permission notice shall be
 *   included in all copies or substantial portions of the Software.
 */

package org.catacombae.dmg.encrypted;

import java.io.PrintStream;
import org.catacombae.dmgextractor.Util;
import org.catacombae.io.ReadableRandomAccessStream;
import org.catacombae.util.IOUtil;

/** This class was generated by CStructToJavaClass. */
public class V2Header {
    /*
     * struct V2Header
     * size: at least 200 bytes
     * description:
     *
     * BP   Size  Type         Identifier                     Description
     * ------------------------------------------------------------------------------------------------------------
     * 0    1*8   uint8_t[8]   signature                      Header signature (ASCII: 'encrcdsa').
     * 8    4     uint32_t     possibleHeaderVersion          Possibly the version of the encrypted volume format.
     * 12   4     uint32_t     laban                          Unknown variable with observed value 16/0x10.
     * 16   4     uint32_t     edward                         Unknown variable with observed value 5/0x5.
     * 20   4     uint32_t     palle                          Unknown variable with observed value 0x80000001.
     * 24   4     uint32_t     keyBits                        Number of bits in the key.
     * 28   4     uint32_t     unknownInt28                   Unknown variable with observed value 91/0x5B.
     * 32   4     uint32_t     unknownInt32                   Unknown variable with observed value 160/0xA0.
     * 36   1*16  uint8_t[16]  unknown1                       Unknown binary data.
     * 52   4     uint32_t     blockSize                      Block size of the encrypted block data.
     * 56   8     uint64_t     encryptedDataLength            Length in bytes of the data that has been encrypted.
     * 64   8     uint64_t     offsetToDataStart              Offset to the start of the encrypted block data.
     * 72   4     uint32_t     unknownInt72                   Unknown variable with observed value 1/0x1.
     * 76   4     uint32_t     unknownInt76                   Unknown variable with observed value 1/0x1.
     * 80   8     uint64_t     possiblePointerToKdfAlgorithm  Could be a pointer to where kdf_algorithm is located.
     * 88   8     uint64_t     unknownLong88                  Unknown variable with observed value 616/0x268.
     * 96   4     uint32_t     kdfAlgorithm                   Algorithm of the key derivation function.
     * 100  4     uint32_t     kdfPrngAlgorithm               ?
     * 104  4     uint32_t     kdfIterationCount              Iteration count (normally 1000).
     * 108  4     uint32_t     kdfSaltLen                     Length of kdfSalt (in bytes).
     * 112  1*32  uint8_t[32]  kdfSalt                        Salt value for key derivation.
     * 144  4     uint32_t     blobEncIvSize                  Size of blobEncIv.
     * 148  1*32  uint8_t[32]  blobEncIv                      Initialization Vector for encryption-key unwrapping.
     * 180  4     uint32_t     blobEncKeyBits                 Number of bits in the keyblob's encryption key.
     * 184  4     uint32_t     blobEncAlgorithm               Encryption algorithm used to encrypt the key blob.
     * 188  4     uint32_t     blobEncPadding                 Padding. (?)
     * 192  4     uint32_t     blobEncMode                    Encryption mode for the algorithm.
     * 196  4     uint32_t     encryptedKeyblobSize           Size of encryptedKeyBlob.
     * 200  1*?   uint8_t[?]   encryptedKeyblob               The encrypted key blob, containing all keys.
     *                                                        The size of this data is specified in encryptedKeyblobSize.
     */

    public static final int STATIC_STRUCTSIZE = 200;

    private final byte[] signature = new byte[1*8];
    private final byte[] possibleHeaderVersion = new byte[4];
    private final byte[] laban = new byte[4];
    private final byte[] edward = new byte[4];
    private final byte[] palle = new byte[4];
    private final byte[] keyBits = new byte[4];
    private final byte[] unknownInt28 = new byte[4];
    private final byte[] unknownInt32 = new byte[4];
    private final byte[] unknown1 = new byte[1*16];
    private final byte[] blockSize = new byte[4];
    private final byte[] encryptedDataLength = new byte[8];
    private final byte[] offsetToDataStart = new byte[8];
    private final byte[] unknownInt72 = new byte[4];
    private final byte[] unknownInt76 = new byte[4];
    private final byte[] possiblePointerToKdfAlgorithm = new byte[8];
    private final byte[] unknownLong88 = new byte[8];
    private final byte[] kdfAlgorithm = new byte[4];
    private final byte[] kdfPrngAlgorithm = new byte[4];
    private final byte[] kdfIterationCount = new byte[4];
    private final byte[] kdfSaltLen = new byte[4];
    private final byte[] kdfSalt = new byte[1*32];
    private final byte[] blobEncIvSize = new byte[4];
    private final byte[] blobEncIv = new byte[1*32];
    private final byte[] blobEncKeyBits = new byte[4];
    private final byte[] blobEncAlgorithm = new byte[4];
    private final byte[] blobEncPadding = new byte[4];
    private final byte[] blobEncMode = new byte[4];
    private final byte[] encryptedKeyblobSize = new byte[4];
    private final byte[] encryptedKeyblob;

    private V2Header(byte[] data, int offset, int length) {
        if(length < 200) {
            throw new IllegalArgumentException("Not enough data for static " +
                    "V2 header fields.");
        }

	System.arraycopy(data, offset+0, signature, 0, 1*8);
	System.arraycopy(data, offset+8, possibleHeaderVersion, 0, 4);
	System.arraycopy(data, offset+12, laban, 0, 4);
	System.arraycopy(data, offset+16, edward, 0, 4);
	System.arraycopy(data, offset+20, palle, 0, 4);
	System.arraycopy(data, offset+24, keyBits, 0, 4);
	System.arraycopy(data, offset+28, unknownInt28, 0, 4);
	System.arraycopy(data, offset+32, unknownInt32, 0, 4);
	System.arraycopy(data, offset+36, unknown1, 0, 1*16);
	System.arraycopy(data, offset+52, blockSize, 0, 4);
	System.arraycopy(data, offset+56, encryptedDataLength, 0, 8);
	System.arraycopy(data, offset+64, offsetToDataStart, 0, 8);
	System.arraycopy(data, offset+72, unknownInt72, 0, 4);
	System.arraycopy(data, offset+76, unknownInt76, 0, 4);
	System.arraycopy(data, offset+80, possiblePointerToKdfAlgorithm, 0, 8);
	System.arraycopy(data, offset+88, unknownLong88, 0, 8);
	System.arraycopy(data, offset+96, kdfAlgorithm, 0, 4);
	System.arraycopy(data, offset+100, kdfPrngAlgorithm, 0, 4);
	System.arraycopy(data, offset+104, kdfIterationCount, 0, 4);
	System.arraycopy(data, offset+108, kdfSaltLen, 0, 4);
	System.arraycopy(data, offset+112, kdfSalt, 0, 1*32);
	System.arraycopy(data, offset+144, blobEncIvSize, 0, 4);
	System.arraycopy(data, offset+148, blobEncIv, 0, 1*32);
	System.arraycopy(data, offset+180, blobEncKeyBits, 0, 4);
	System.arraycopy(data, offset+184, blobEncAlgorithm, 0, 4);
	System.arraycopy(data, offset+188, blobEncPadding, 0, 4);
	System.arraycopy(data, offset+192, blobEncMode, 0, 4);
	System.arraycopy(data, offset+196, encryptedKeyblobSize, 0, 4);
        encryptedKeyblob = new byte[getEncryptedKeyblobSize()];
    }

    public V2Header(byte[] data, int offset)
    {
        this(data, offset, data.length - offset);

        System.arraycopy(data, offset+200, encryptedKeyblob, 0,
                encryptedKeyblob.length);
    }

    public V2Header(ReadableRandomAccessStream stream, int offset)
    {
        this(IOUtil.readFully(stream, offset, 200), 0, 200);

        stream.seek(offset + 200);
        stream.readFully(encryptedKeyblob, 0, encryptedKeyblob.length);
    }

    public int length() { return 200 + getEncryptedKeyblobSize(); }

    /** Header signature (ASCII: 'encrcdsa'). */
    public byte[] getSignature() { return Util.readByteArrayBE(signature); }
    /** Possibly the version of the encrypted volume format. */
    public int getPossibleHeaderVersion() { return Util.readIntBE(possibleHeaderVersion); }
    /** Unknown variable with observed value 16/0x10. */
    public int getLaban() { return Util.readIntBE(laban); }
    /** Unknown variable with observed value 5/0x5. */
    public int getEdward() { return Util.readIntBE(edward); }
    /** Unknown variable with observed value 0x80000001. */
    public int getPalle() { return Util.readIntBE(palle); }

    /**
     * Number of bits in the key (128 for AES-128 encrypted images, 256 for
     * AES-256, ...).
     */
    public int getKeyBits() { return Util.readIntBE(keyBits); }

    /** Unknown variable with observed value 91/0x5B. */
    public int getUnknownInt28() { return Util.readIntBE(unknownInt28); }
    /** Unknown variable with observed value 160/0xA0. */
    public int getUnknownInt32() { return Util.readIntBE(unknownInt32); }
    /** Unknown binary data. */
    public byte[] getUnknown1() { return Util.readByteArrayBE(unknown1); }
    /** Block size of the encrypted block data. */
    public int getBlockSize() { return Util.readIntBE(blockSize); }
    /** Length in bytes of the data that has been encrypted. */
    public long getEncryptedDataLength() { return Util.readLongBE(encryptedDataLength); }
    /** Offset to the start of the encrypted block data. */
    public long getOffsetToDataStart() { return Util.readLongBE(offsetToDataStart); }
    /** Unknown variable with observed value 1/0x1. */
    public int getUnknownInt72() { return Util.readIntBE(unknownInt72); }
    /** Unknown variable with observed value 1/0x1. */
    public int getUnknownInt76() { return Util.readIntBE(unknownInt76); }
    /** Could be a pointer to where kdf_algorithm is located. */
    public long getPossiblePointerToKdfAlgorithm() { return Util.readLongBE(possiblePointerToKdfAlgorithm); }
    /** Unknown variable with observed value 616/0x268. */
    public long getUnknownLong88() { return Util.readLongBE(unknownLong88); }
    /** Algorithm of the key derivation function. */
    public int getKdfAlgorithm() { return Util.readIntBE(kdfAlgorithm); }
    /** ? */
    public int getKdfPrngAlgorithm() { return Util.readIntBE(kdfPrngAlgorithm); }
    /** Iteration count (normally 1000). */
    public int getKdfIterationCount() { return Util.readIntBE(kdfIterationCount); }
    /** Length of kdfSalt (in bytes). */
    public int getKdfSaltLen() { return Util.readIntBE(kdfSaltLen); }
    /** Salt value for key derivation. */
    public byte[] getKdfSalt() { return Util.readByteArrayBE(kdfSalt); }
    /** Size of blobEncIv. */
    public int getBlobEncIvSize() { return Util.readIntBE(blobEncIvSize); }
    /** Initialization Vector for encryption-key unwrapping. */
    public byte[] getBlobEncIv() { return Util.readByteArrayBE(blobEncIv); }
    /** Number of bits in the keyblob's encryption key. */
    public int getBlobEncKeyBits() { return Util.readIntBE(blobEncKeyBits); }
    /** Encryption algorithm used to encrypt the key blob. */
    public int getBlobEncAlgorithm() { return Util.readIntBE(blobEncAlgorithm); }
    /** Padding. (?) */
    public int getBlobEncPadding() { return Util.readIntBE(blobEncPadding); }
    /** Encryption mode for the algorithm. */
    public int getBlobEncMode() { return Util.readIntBE(blobEncMode); }
    /** Size of encryptedKeyBlob. */
    public int getEncryptedKeyblobSize() { return Util.readIntBE(encryptedKeyblobSize); }
    /** The encrypted key blob, containing all keys. */
    public byte[] getEncryptedKeyblob() { return Util.readByteArrayBE(encryptedKeyblob); }

    public void printFields(PrintStream ps, String prefix) {
	ps.println(prefix + " signature: \"" + Util.toASCIIString(getSignature()) + "\"");
	ps.println(prefix + " possibleHeaderVersion: " + getPossibleHeaderVersion());
	ps.println(prefix + " laban: " + getLaban());
	ps.println(prefix + " edward: " + getEdward());
	ps.println(prefix + " palle: " + getPalle());
	ps.println(prefix + " keyBits: " + getKeyBits());
	ps.println(prefix + " unknownInt28: " + getUnknownInt28());
	ps.println(prefix + " unknownInt32: " + getUnknownInt32());
	ps.println(prefix + " unknown1: " + getUnknown1());
	ps.println(prefix + " blockSize: " + getBlockSize());
	ps.println(prefix + " encryptedDataLength: " + getEncryptedDataLength());
	ps.println(prefix + " offsetToDataStart: " + getOffsetToDataStart());
	ps.println(prefix + " unknownInt72: " + getUnknownInt72());
	ps.println(prefix + " unknownInt76: " + getUnknownInt76());
	ps.println(prefix + " possiblePointerToKdfAlgorithm: " + getPossiblePointerToKdfAlgorithm());
	ps.println(prefix + " unknownLong88: " + getUnknownLong88());
	ps.println(prefix + " kdfAlgorithm: " + getKdfAlgorithm());
	ps.println(prefix + " kdfPrngAlgorithm: " + getKdfPrngAlgorithm());
	ps.println(prefix + " kdfIterationCount: " + getKdfIterationCount());
	ps.println(prefix + " kdfSaltLen: " + getKdfSaltLen());
	ps.println(prefix + " kdfSalt: 0x" + Util.byteArrayToHexString(getKdfSalt()));
	ps.println(prefix + " blobEncIvSize: " + getBlobEncIvSize());
	ps.println(prefix + " blobEncIv: 0x" + Util.byteArrayToHexString(getBlobEncIv()));
	ps.println(prefix + " blobEncKeyBits: " + getBlobEncKeyBits());
	ps.println(prefix + " blobEncAlgorithm: " + getBlobEncAlgorithm());
	ps.println(prefix + " blobEncPadding: " + getBlobEncPadding());
	ps.println(prefix + " blobEncMode: " + getBlobEncMode());
	ps.println(prefix + " encryptedKeyblobSize: " + getEncryptedKeyblobSize());
	ps.println(prefix + " encryptedKeyblob: 0x" + Util.byteArrayToHexString(getEncryptedKeyblob()));
    }

    public void print(PrintStream ps, String prefix) {
	ps.println(prefix + "V2Header:");
	printFields(ps, prefix);
    }

    public byte[] getBytes() {
	byte[] result = new byte[length()];
	int offset = 0;
	System.arraycopy(this.signature, 0, result, offset, this.signature.length); offset += this.signature.length;
	System.arraycopy(this.possibleHeaderVersion, 0, result, offset, this.possibleHeaderVersion.length); offset += this.possibleHeaderVersion.length;
	System.arraycopy(this.laban, 0, result, offset, this.laban.length); offset += this.laban.length;
	System.arraycopy(this.edward, 0, result, offset, this.edward.length); offset += this.edward.length;
	System.arraycopy(this.palle, 0, result, offset, this.palle.length); offset += this.palle.length;
	System.arraycopy(this.keyBits, 0, result, offset, this.keyBits.length); offset += this.keyBits.length;
	System.arraycopy(this.unknownInt28, 0, result, offset, this.unknownInt28.length); offset += this.unknownInt28.length;
	System.arraycopy(this.unknownInt32, 0, result, offset, this.unknownInt32.length); offset += this.unknownInt32.length;
	System.arraycopy(this.unknown1, 0, result, offset, this.unknown1.length); offset += this.unknown1.length;
	System.arraycopy(this.blockSize, 0, result, offset, this.blockSize.length); offset += this.blockSize.length;
	System.arraycopy(this.encryptedDataLength, 0, result, offset, this.encryptedDataLength.length); offset += this.encryptedDataLength.length;
	System.arraycopy(this.offsetToDataStart, 0, result, offset, this.offsetToDataStart.length); offset += this.offsetToDataStart.length;
	System.arraycopy(this.unknownInt72, 0, result, offset, this.unknownInt72.length); offset += this.unknownInt72.length;
	System.arraycopy(this.unknownInt76, 0, result, offset, this.unknownInt76.length); offset += this.unknownInt76.length;
	System.arraycopy(this.possiblePointerToKdfAlgorithm, 0, result, offset, this.possiblePointerToKdfAlgorithm.length); offset += this.possiblePointerToKdfAlgorithm.length;
	System.arraycopy(this.unknownLong88, 0, result, offset, this.unknownLong88.length); offset += this.unknownLong88.length;
	System.arraycopy(this.kdfAlgorithm, 0, result, offset, this.kdfAlgorithm.length); offset += this.kdfAlgorithm.length;
	System.arraycopy(this.kdfPrngAlgorithm, 0, result, offset, this.kdfPrngAlgorithm.length); offset += this.kdfPrngAlgorithm.length;
	System.arraycopy(this.kdfIterationCount, 0, result, offset, this.kdfIterationCount.length); offset += this.kdfIterationCount.length;
	System.arraycopy(this.kdfSaltLen, 0, result, offset, this.kdfSaltLen.length); offset += this.kdfSaltLen.length;
	System.arraycopy(this.kdfSalt, 0, result, offset, this.kdfSalt.length); offset += this.kdfSalt.length;
	System.arraycopy(this.blobEncIvSize, 0, result, offset, this.blobEncIvSize.length); offset += this.blobEncIvSize.length;
	System.arraycopy(this.blobEncIv, 0, result, offset, this.blobEncIv.length); offset += this.blobEncIv.length;
	System.arraycopy(this.blobEncKeyBits, 0, result, offset, this.blobEncKeyBits.length); offset += this.blobEncKeyBits.length;
	System.arraycopy(this.blobEncAlgorithm, 0, result, offset, this.blobEncAlgorithm.length); offset += this.blobEncAlgorithm.length;
	System.arraycopy(this.blobEncPadding, 0, result, offset, this.blobEncPadding.length); offset += this.blobEncPadding.length;
	System.arraycopy(this.blobEncMode, 0, result, offset, this.blobEncMode.length); offset += this.blobEncMode.length;
	System.arraycopy(this.encryptedKeyblobSize, 0, result, offset, this.encryptedKeyblobSize.length); offset += this.encryptedKeyblobSize.length;
	System.arraycopy(this.encryptedKeyblob, 0, result, offset, this.encryptedKeyblob.length); offset += this.encryptedKeyblob.length;
	return result;
    }
    
}
