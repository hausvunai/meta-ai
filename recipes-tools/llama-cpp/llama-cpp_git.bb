DESCRIPTION = "LLM inference in C/C++"
LICENSE = "MIT"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI = "\
    git://github.com/ggerganov/llama.cpp.git;protocol=http;branch=master \
    "

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit cmake
