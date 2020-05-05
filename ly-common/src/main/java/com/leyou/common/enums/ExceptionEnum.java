package com.leyou.common.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ExceptionEnum {

    CATEGORY_BOT_FOUND(404, "分类未找到"),
    BRAND_NOT_FOUND(404, "品牌未找到"),
    BRAND_CREATE_FAILED(404, "新增品牌失败"),
    SPU_LIST_NOT_FOUND(404, "产品通用属性LIST未找到"),
    UPLOAD_FILE_ERROR(500, "文件上传失败"),
    INVALID_FILE_TYPE(500, "非法文件类型"),
    UPLOAD_IMAGE_EXCEPTION(500, "文件上传异常"),
    BRAND_UPDATE_FAIL(500, "品牌更新失败"),
    UPDATE_SPEC_PARAM_FAILED(500, "规格参数更新失败"),
    INVALID_SPEC_PARAM_ID(500, "非法规格组参数ID"),
    DELETE_SPEC_PARAM_FAILED(500, "删除规格组参数失败"),
    SAVE_SPEC_PARAM_FAILED(500, "保存规格组参数失败"),
    SAVE_SPEC_GROUP_FAIL(500, "保存规格组失败"),
    UPDATE_SPEC_GROUP_FAIL(500, "更新规格组失败"),
    DELETE_SPEC_GROUP_FAIL(500, "删除规格组失败"),
    SPEC_GROUP_NOT_FOUND(404, "规格组未找到"),
    SPEC_PARAM_NOT_FOUND(404, "规格组参数未找到"),
    ;

    int value;
    String message;
    public int value() {
        return this.value;
    }

    public String message() {
        return this.message;
    }
}
