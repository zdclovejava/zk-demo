package com.jiagouedu.znode;/* ━━━━━━如来保佑━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━永无BUG━━━━━━
 * 图灵学院-悟空老师
 * 以往视频加小乔老师QQ：895900009
 * 悟空老师QQ：245553999
 */

import org.apache.zookeeper.KeeperException;

import com.jiagouedu.zookeeper.znode.ZookeeperCrud;

public class Test {
   public static void main(String[] args) throws KeeperException, InterruptedException {
      ZookeeperCrud zookeeperCrud=new ZookeeperCrud();
      if(null!=zookeeperCrud.exists("/enode"))
      {
    	  zookeeperCrud.delete("/enode");
      }
      if(null!=zookeeperCrud.exists("/pnode"))
      {
    	  zookeeperCrud.delete("/pnode");
      }
      //创建临时节点
      zookeeperCrud.createEphemeral("/enode","This is ephemeral node");
      //创建持久节点
      zookeeperCrud.createPersistent("/pnode", "This is Persistent node");
      System.out.println("临时节点wukong="+zookeeperCrud.getData("/enode"));
      System.out.println("持久节点pernode"+zookeeperCrud.getData("/pnode"));

   }
}
