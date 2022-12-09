import NewFormInspection from "../src/components/FormIspecao";
import Nav from "../src/components/Nav";
import Footer from "../src/components/patterns/Footer";
import HeadComponent from "../src/components/patterns/Head";
import styles from '../styles/Home.module.css'

export default function NewInspection() {
  return (
    <div >
      <HeadComponent />
      <Nav />
      <NewFormInspection />
      <Footer style={styles.footer} />
    </div>
  )
}