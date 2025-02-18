package vn.lightforknight.configs;

import jakarta.persistence.EntityManager;

import jakarta.persistence.EntityTransaction;

import vn.lightforknight.entity.Category;

import vn.lightforknight.entity.Video;

public class Test {

	public static void main(String[] args) {

		EntityManager enma = jpaConfig.getEntityManager();

		EntityTransaction trans = enma.getTransaction();

		Category cate = new Category();

		cate.setCategoryname("Iphone");

		cate.setImages("abc.jpg");

		cate.setStatus(1);

		Video video = new Video();

		video.setVideoId("v001");

		video.setTitle("test");

		video.setCategory(cate);

		try {

			trans.begin();

			// enma.persist(cate);

			// enma.persist(video);

			trans.commit();

		} catch (Exception e) {

			e.printStackTrace();

			trans.rollback();

			throw e;

		} finally {

			enma.close();

		}

	}

}
