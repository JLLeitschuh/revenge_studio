package com.ninjaflip.androidrevenge.core.apktool.apkinfo.apkparser;


import com.ninjaflip.androidrevenge.core.apktool.apkinfo.apkparser.bean.ApkMeta;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

/**
 * Static utils method for parse apk file
 *
 * @author Liu Dong
 */
public class ApkParsers {

    /**
     * Get apk meta info for apk file
     *
     * @throws IOException
     */
    public static ApkMeta getMetaInfo(String apkFilePath) throws IOException {
        try (ApkFile apkFile = new ApkFile(apkFilePath)) {
            return apkFile.getApkMeta();
        }
    }

    /**
     * Get apk meta info for apk file
     *
     * @throws IOException
     */
    public static ApkMeta getMetaInfo(File file) throws IOException {
        try (ApkFile apkFile = new ApkFile(file)) {
            return apkFile.getApkMeta();
        }
    }

    /**
     * Get apk meta info for apk file
     *
     * @throws IOException
     */
    public static ApkMeta getMetaInfo(byte[] apkData) throws IOException {
        try (ByteArrayApkFile apkFile = new ByteArrayApkFile(apkData)) {
            return apkFile.getApkMeta();
        }
    }

    /**
     * Get apk meta info for apk file, with locale
     *
     * @throws IOException
     */
    public static ApkMeta getMetaInfo(String apkFilePath, Locale locale) throws IOException {
        try (ApkFile apkFile = new ApkFile(apkFilePath)) {
            apkFile.setPreferredLocale(locale);
            return apkFile.getApkMeta();
        }
    }

    /**
     * Get apk meta info for apk file
     *
     * @throws IOException
     */
    public static ApkMeta getMetaInfo(File file, Locale locale) throws IOException {
        try (ApkFile apkFile = new ApkFile(file)) {
            apkFile.setPreferredLocale(locale);
            return apkFile.getApkMeta();
        }
    }

    /**
     * Get apk meta info for apk file
     *
     * @throws IOException
     */
    public static ApkMeta getMetaInfo(byte[] apkData, Locale locale) throws IOException {
        try (ByteArrayApkFile apkFile = new ByteArrayApkFile(apkData)) {
            apkFile.setPreferredLocale(locale);
            return apkFile.getApkMeta();
        }
    }

    /**
     * Get apk manifest xml file as text
     *
     * @throws IOException
     */
    public static String getManifestXml(String apkFilePath) throws IOException {
        try (ApkFile apkFile = new ApkFile(apkFilePath)) {
            return apkFile.getManifestXml();
        }
    }

    /**
     * Get apk manifest xml file as text
     *
     * @throws IOException
     */
    public static String getManifestXml(File file) throws IOException {
        try (ApkFile apkFile = new ApkFile(file)) {
            return apkFile.getManifestXml();
        }
    }

    /**
     * Get apk manifest xml file as text
     *
     * @throws IOException
     */
    public static String getManifestXml(byte[] apkData) throws IOException {
        try (ByteArrayApkFile apkFile = new ByteArrayApkFile(apkData)) {
            return apkFile.getManifestXml();
        }
    }

    /**
     * Get apk manifest xml file as text
     *
     * @throws IOException
     */
    public static String getManifestXml(String apkFilePath, Locale locale) throws IOException {
        try (ApkFile apkFile = new ApkFile(apkFilePath)) {
            apkFile.setPreferredLocale(locale);
            return apkFile.getManifestXml();
        }
    }

    /**
     * Get apk manifest xml file as text
     *
     * @throws IOException
     */
    public static String getManifestXml(File file, Locale locale) throws IOException {
        try (ApkFile apkFile = new ApkFile(file)) {
            apkFile.setPreferredLocale(locale);
            return apkFile.getManifestXml();
        }
    }

    /**
     * Get apk manifest xml file as text
     *
     * @throws IOException
     */
    public static String getManifestXml(byte[] apkData, Locale locale) throws IOException {
        try (ByteArrayApkFile apkFile = new ByteArrayApkFile(apkData)) {
            apkFile.setPreferredLocale(locale);
            return apkFile.getManifestXml();
        }
    }
}
