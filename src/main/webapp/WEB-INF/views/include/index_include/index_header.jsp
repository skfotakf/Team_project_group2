<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header id="header">
        <div class="imdbheader">

            <h1><a href="" class="logo">IMDb</a></h1>

            <ul id="menu">
                <a href="">
                    <li class="icon"><i class="fas fa-list"></i> Menu</li>
                </a>
            </ul>
            <div id="serach_container">
                <select name="serach_navbar" id="serach_navbar">
                    <div>
                        <option value="all">All</option>
                        <option value="Titles">Titles</option>
                        <option value="TV Episodes">TV Episodes</option>
                        <option value="Celebs">Celebs</option>
                        <option value="Companies">Companies</option>
                        <option value="Keywords">Keywords</option>
                        <option value="Advanced Search">Advanced Search</option>
                    </div>
                </select>
                <input type="text" placeholder="Search IMDb" >
                <button><i class="fas fa-search"></i></button>
                
            </div>
            <ul class="top_nav">
                <a href="">
                    <li>IMDbPro </li>
                </a>
                <a href="">
                    <li><i class="far fa-plus-square"></i> Watchlist</li>
                </a>
                <a href="">
                    <li>Sign In</li>
                </a>
            </ul>
        </div>
</header>