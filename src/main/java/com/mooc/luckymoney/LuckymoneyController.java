package com.mooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PersistenceUnit;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Jinbin_z
 * @description
 * @date 2019/10/21 20:35
 */
@RestController
public class LuckymoneyController {
    /*
    实现红包列表
     */
    @Autowired
    private LuckymoneyRepository repository;
    @GetMapping("/luckymoneys")
    public List<Luckymoney> list(){
        return repository.findAll();
    }
    /*
    创建一个红包（发红包）
     */
    @PostMapping
    public Luckymoney create(@RequestParam("producer")String producer,
                             @RequestParam("money") BigDecimal money){
        Luckymoney luckymoney=new Luckymoney();
        luckymoney.setProducer(producer);
        luckymoney.setMoney(money);
        return repository.save(luckymoney);
    }
    /*
    依据id进行红包的查询
     */
    @GetMapping("/luckymoneys/find")
    public Luckymoney findById(@RequestParam("id")Integer id){
        return repository.findById(id).orElse(null);
    }
    /*
    更新红包：按照id进行相关的更新(领红包）
     */
    @PutMapping("luckymoneys/update/{id}")
    public Luckymoney update(@PathVariable("id")Integer id,
                             @RequestParam("consumer")String consumer){
        Luckymoney luckymoney=new Luckymoney();
        luckymoney.setId(id);
        luckymoney.setConsumer(consumer);
        return repository.save(luckymoney);

    }


}
