CREATE TABLE `movie_mst` (
	`movie_idn`	not null	NOT NULL,
	`movie_title`	not null	NOT NULL,
	`movie_release`	not null	NULL,
	`movie_viewCnt`	not null	NULL,
	`mov_like_idn`	not null	NULL,
	`mov_lik_idn`	not null	NOT NULL,
	`mov_rat_idn`	not null	NOT NULL,
	`mov_gnr_idn`	not null	NOT NULL,
	`mov_cht`	not null	NOT NULL,
	`mov_viw_list_idn`	not null	NOT NULL,
	`number`	not null	NOT NULL
);

CREATE TABLE `user_mst` (
	`number`	not null	NOT NULL,
	`id`	not null	NULL,
	`password`	not null	NULL,
	`email`	not null	NULL,
	`name`	not null	NULL,
	`nickname`	not null	NULL,
	`phoneNum`	not null	NULL,
	`role`	not null	NULL,
	`provider`	not null	NULL
);

CREATE TABLE `movie_rating` (
	`mov_rat_idn`	not null	NOT NULL,
	`mov_rat_title`	not null	NULL,
	`mov_rat_avg`	not null	NULL,
	`mov_rat_click`	not null	NULL,
	`movie_idn`	not null	NOT NULL
);

CREATE TABLE `movie_like` (
	`mov_lik_idn`	not null	NOT NULL,
	`movie_idn`	not null	NOT NULL
);

CREATE TABLE `movie_detail` (
	`mov_dtl_idn`	not null	NOT NULL,
	`movie_idn`	not null	NOT NULL,
	`mov_viwList_idn`	not null	NOT NULL,
	`mov_dtl_title`	not null	NULL,
	`mov_dtl_info`	not null	NULL,
	`mov_dtl_img`	not null	NULL,
	`mov_dtl_crt`	not null	NULL,
	`mov_same_gnr_idn`	not null	NOT NULL,
	`mov_riw_user_idn`	not null	NOT NULL,
	`mov_riw_pfn_idn`	not null	NOT NULL
);

CREATE TABLE `movie_chart` (
	`mov_cht`	not null	NOT NULL,
	`mov_cht_name`	not null	NULL
);

CREATE TABLE `movie_genre` (
	`mov_gnr_idn`	not null	NOT NULL,
	`mov_gnr`	not null	NULL
);

CREATE TABLE `movie_view_list` (
	`mov_viw_list_idn`	not null	NOT NULL,
	`number`	not null	NOT NULL,
	`movie_idn`	not null	NOT NULL
);

CREATE TABLE `movie_review_user` (
	`mov_riw_user_idn`	not null	NOT NULL,
	`mov_riw_user_titlev`	not null	NULL,
	`mov_riw_user_content`	not null	NULL,
	`mov_riw_user_regdate`	null	NULL,
	`number`	not null	NOT NULL,
	`movie_idn`	not null	NOT NULL
);

CREATE TABLE `movie_sameGenre` (
	`mov_same_gnr_idn`	not null	NOT NULL,
	`mov_gnr_idn`	not null	NOT NULL
);

CREATE TABLE `movie_review_professional` (
	`mov_riw_pfn_idn`	not null	NOT NULL,
	`mov_riw_pfn_title`	not null	NULL,
	`mov_riw_pfn_content`	null	NULL,
	`mov_riw_pfn_regdate`	null	NULL,
	`number`	not null	NOT NULL,
	`movie_idn`	not null	NOT NULL
);

ALTER TABLE `movie_mst` ADD CONSTRAINT `PK_MOVIE_MST` PRIMARY KEY (
	`movie_idn`
);

ALTER TABLE `user_mst` ADD CONSTRAINT `PK_USER_MST` PRIMARY KEY (
	`number`
);

ALTER TABLE `movie_rating` ADD CONSTRAINT `PK_MOVIE_RATING` PRIMARY KEY (
	`mov_rat_idn`
);

ALTER TABLE `movie_like` ADD CONSTRAINT `PK_MOVIE_LIKE` PRIMARY KEY (
	`mov_lik_idn`
);

ALTER TABLE `movie_detail` ADD CONSTRAINT `PK_MOVIE_DETAIL` PRIMARY KEY (
	`mov_dtl_idn`,
	`movie_idn`,
	`mov_viwList_idn`
);

ALTER TABLE `movie_chart` ADD CONSTRAINT `PK_MOVIE_CHART` PRIMARY KEY (
	`mov_cht`
);

ALTER TABLE `movie_genre` ADD CONSTRAINT `PK_MOVIE_GENRE` PRIMARY KEY (
	`mov_gnr_idn`
);

ALTER TABLE `movie_view_list` ADD CONSTRAINT `PK_MOVIE_VIEW_LIST` PRIMARY KEY (
	`mov_viw_list_idn`,
	`number`,
	`movie_idn`
);

ALTER TABLE `movie_review_user` ADD CONSTRAINT `PK_MOVIE_REVIEW_USER` PRIMARY KEY (
	`mov_riw_user_idn`
);

ALTER TABLE `movie_sameGenre` ADD CONSTRAINT `PK_MOVIE_SAMEGENRE` PRIMARY KEY (
	`mov_same_gnr_idn`
);

ALTER TABLE `movie_review_professional` ADD CONSTRAINT `PK_MOVIE_REVIEW_PROFESSIONAL` PRIMARY KEY (
	`mov_riw_pfn_idn`
);

ALTER TABLE `movie_detail` ADD CONSTRAINT `FK_movie_mst_TO_movie_detail_1` FOREIGN KEY (
	`movie_idn`
)
REFERENCES `movie_mst` (
	`movie_idn`
);

ALTER TABLE `movie_detail` ADD CONSTRAINT `FK_movie_view_list_TO_movie_detail_1` FOREIGN KEY (
	`mov_viwList_idn`
)
REFERENCES `movie_view_list` (
	`mov_viw_list_idn`
);

ALTER TABLE `movie_view_list` ADD CONSTRAINT `FK_user_mst_TO_movie_view_list_1` FOREIGN KEY (
	`number`
)
REFERENCES `user_mst` (
	`number`
);

ALTER TABLE `movie_view_list` ADD CONSTRAINT `FK_movie_mst_TO_movie_view_list_1` FOREIGN KEY (
	`movie_idn`
)
REFERENCES `movie_mst` (
	`movie_idn`
);

