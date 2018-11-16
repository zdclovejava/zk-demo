package com.jiagouedu.acl;/* ━━━━━━如来保佑━━━━━━
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

import com.jiagouedu.zookeeper.acl.ZookeeperAcl;
import org.apache.zookeeper.KeeperException;

public class ZookeeperAclTest {

   public static void main(String[] args) throws KeeperException, InterruptedException {
    /*  *//***这个是没有权限**//*
      ZookeeperAcl zookeeperAcl = new ZookeeperAcl();
      zookeeperAcl.createPersistentAcl("/wukongAcl","2018");
      zookeeperAcl.getData("/wukongAcl");*/

      /***这个是权限**/
      ZookeeperAcl zookeeperAcl2 = new ZookeeperAcl(true);
      ZookeeperAcl zookeeperAcl3 = new ZookeeperAcl(true);
      zookeeperAcl2.createPersistentAcl("/wukongAcl","2018");
      zookeeperAcl2.getData("/wukongAcl");
      Thread.sleep(5000);
      System.out.println(zookeeperAcl3.getData("/wukongAcl"));;
      //zookeeperAcl2.createPersistent("/wukongNoAcl","2018");



   }

}
