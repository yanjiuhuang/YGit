LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)

# compile the needed libraries into one big archive file

LOCAL_MODULE := ygit


LOCAL_STATIC_LIBRARIES := libgit2

LOCAL_SRC_FILES := main.c


include $(BUILD_SHARED_LIBRARY)