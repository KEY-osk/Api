package kiosk.kioskpractice.repository;

import kiosk.kioskpractice.domain.Enterprise;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryEnterpriseRepository implements EnterpriseRepository {
    private List<Enterprise> enterprises;

    public MemoryEnterpriseRepository() {
        this.enterprises = new ArrayList<>();
        // 가상의 데이터베이스에서 데이터 추가
        enterprises.add(new Enterprise("1", "cafe", "투썸플레이스", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDAxMDhfMjIg%2FMDAxNTc4NDEyMjQwNzc2.BunUn2J83_b7yIvZmXHNlSx5IZImIIn_ghrLYRykzncg.c0ij0sSm5_vSIswW5zX7Uw4NnrU7gp7MNLB01wHx-Xsg.PNG.qhdbs00428%2F1578412242349.png&type=sc960_832"));
        enterprises.add(new Enterprise("2", "cafe", "메머드익스프레스", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDAxMDhfMjIg%2FMDAxNTc4NDEyMjQwNzc2.BunUn2J83_b7yIvZmXHNlSx5IZImIIn_ghrLYRykzncg.c0ij0sSm5_vSIswW5zX7Uw4NnrU7gp7MNLB01wHx-Xsg.PNG.qhdbs00428%2F1578412242349.png&type=sc960_832"));
        enterprises.add(new Enterprise("3", "cafe", "할리스", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDAxMDhfMjIg%2FMDAxNTc4NDEyMjQwNzc2.BunUn2J83_b7yIvZmXHNlSx5IZImIIn_ghrLYRykzncg.c0ij0sSm5_vSIswW5zX7Uw4NnrU7gp7MNLB01wHx-Xsg.PNG.qhdbs00428%2F1578412242349.png&type=sc960_832"));
        enterprises.add(new Enterprise("4", "cafe", "탐앤탐스", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDAxMDhfMjIg%2FMDAxNTc4NDEyMjQwNzc2.BunUn2J83_b7yIvZmXHNlSx5IZImIIn_ghrLYRykzncg.c0ij0sSm5_vSIswW5zX7Uw4NnrU7gp7MNLB01wHx-Xsg.PNG.qhdbs00428%2F1578412242349.png&type=sc960_832"));
    }

    @Override
    public List<Enterprise> getAllEnterprises() {
        return enterprises;
    }
}


/*
package kiosk.kioskpractice.repository;


import kiosk.kioskpractice.domain.Enterprise;

import java.util.*;

public class MemoryEnterpriseRepository implements EnterpriseRepository {

    private static Map<String, Enterprise> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Enterprise save(Enterprise enterprise) {
        enterprise.setEnterpriseId(++sequence);
        store.put(enterprise.getEnterpriseId(), enterprise);
        return enterprise;
    }

    @Override
    public Optional<Enterprise> findByEnterpriseId(String EnterpriseId) {
        return Optional.store.get(enterpriseId);
    }

    @Override
    public Optional<Enterprise> findByName(String name) {
        return Optional.store.get(name);
    }

    @Override
    public Optional<Enterprise> findByUrl(String url) {
        return Optional.store.get(url);
    }

    @Override
    public List<Enterprise> findAll() {
        return new ArrayList<>(store.values()); // 위에서 values가 member이므로 -> store에 있는 member들을 list로 반환
    }

    public void clearStore() {
        store.clear();
    }
}

 */
