package cn.hfbin.springcloud.service;

import cn.hfbin.springcloud.entity.Dept;

import java.util.List;


public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
