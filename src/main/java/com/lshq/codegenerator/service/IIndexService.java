package com.lshq.codegenerator.service;

import com.fengwenyi.api.result.ResponseTemplate;
import com.lshq.codegenerator.vo.CodeGeneratorRequestVo;

/**
 * @author <a href="https://www.zhanghan.com">张寒</a>
 * @since 2021-07-12
 */
public interface IIndexService {

    /**
     * 生成代码
     * @param requestVo
     * @return
     */
    ResponseTemplate<Void> codeGenerator(CodeGeneratorRequestVo requestVo);

    /**
     * 升级检查
     * */
    String upgrade(String version);

}
