package com.larry.forum.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.larry.forum.model.entity.BmsTip;

public interface IBmsTipService extends IService<BmsTip> {
    BmsTip getRandomTip();
}
