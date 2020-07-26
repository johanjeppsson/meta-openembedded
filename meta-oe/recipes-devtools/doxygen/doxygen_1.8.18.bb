DESCRIPTION = "Doxygen is the de facto standard tool for generating documentation from annotated C++ sources."
HOMEPAGE = "http://www.doxygen.org/"

LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "flex-native bison-native"

SRC_URI = "${SOURCEFORGE_MIRROR}/${BPN}/${BP}.src.tar.gz \
           file://0001-build-don-t-look-for-Iconv.patch \
"
SRC_URI_append_class-native = " file://doxygen-native-only-check-python3.patch"
SRC_URI[md5sum] = "eda8e82fcc58970894029b0399776cb5"
SRC_URI[sha256sum] = "18173d9edc46d2d116c1f92a95d683ec76b6b4b45b817ac4f245bb1073d00656"

inherit cmake python3native

BBCLASSEXTEND = "native nativesdk"
