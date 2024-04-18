import React from "react";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";

import AddTutorial from "./components/AddTutorial";
import Tutorial from "./components/Tutorial";
import TutorialsList from "./components/TutorialsList";

function App() {
  return (
    <>
      <Router>
        <nav className="navbar navbar-expand-lg navbar-dark bg-info shadow">
          <Link to="/" className="navbar-brand text-white">
            Tutorials List
          </Link>
          <button
            className="navbar-toggler"
            type="button"
            data-toggle="collapse"
            data-target="#navbarNavAltMarkup"
            aria-controls="navbarNavAltMarkup"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div className="navbar-nav">
              <li className="nav-item">
                <Link to="/tutorials" className="nav-link active text-white">
                  List Display
                </Link>
              </li>
              <li className="nav-item">
                <Link to="/add" className="nav-link text-white">
                  Add
                </Link>
              </li>
            </div>
          </div>
        </nav>

        <div className="container mt-3">
          <Switch>
            <Route exact path={["/", "/tutorials"]} component={TutorialsList} />
            <Route exact path="/add" component={AddTutorial} />
            <Route path="/tutorials/:id" component={Tutorial} />
          </Switch>
        </div>
      </Router>
    </>
  );
}

export default App;
